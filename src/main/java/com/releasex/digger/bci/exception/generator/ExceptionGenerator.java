package com.releasex.digger.bci.exception.generator;

import java.io.FileOutputStream;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class ExceptionGenerator {
	
	public static void transform(String FQCN, String newClassName) throws Exception  {
		FileOutputStream fos = null;
		try {
			ClassReader reader = new ClassReader(FQCN);	
			ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);	
			ClassVisitor visitor = new ExceptionClassVisitor(Opcodes.ASM4, writer);
	
			reader.accept(visitor, ClassReader.SKIP_FRAMES);
			
			byte[] b = writer.toByteArray();
			fos = new FileOutputStream(newClassName + ".class");
			fos.write(b);
			fos.flush();
		} finally {
			fos.close();
		}
	}
}
