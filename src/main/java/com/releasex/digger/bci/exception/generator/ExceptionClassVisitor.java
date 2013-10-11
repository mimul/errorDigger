package com.releasex.digger.bci.exception.generator;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class ExceptionClassVisitor extends ClassVisitor implements Opcodes {

	private static final String NAME_CONSTRUCTOR = "<init>";
	
	public ExceptionClassVisitor(int arg0, ClassVisitor arg1) {
		super(arg0, arg1);
	}
	
	@Override
	public MethodVisitor visitMethod(int access, String name, String desc, String sig, String[] exes) {
		MethodVisitor mv = super.visitMethod(access, name, desc, sig, exes);
		
		if(name.equals(NAME_CONSTRUCTOR)) {
			ExceptionConstructorAdviceAdapter ecaa = new ExceptionConstructorAdviceAdapter(Opcodes.ASM4, mv, access, name, desc);
			return ecaa;
		}
		
		return mv;
	}

}
