package com.releasex.digger.bci.exception.generator;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.AdviceAdapter;

import com.releasex.digger.bci.exception.tracker.ExceptionTracker;


public class ExceptionConstructorAdviceAdapter extends AdviceAdapter {

	protected ExceptionConstructorAdviceAdapter(int api, MethodVisitor mv,
			int access, String name, String desc) {
		super(api, mv, access, name, desc);
	}
	
	@Override
	protected void onMethodEnter() {
		// TODO Auto-generated method stub
		super.onMethodEnter();
	}
	
	@Override
	protected void onMethodExit(int opcode) {
		// TODO Auto-generated method stub
		super.onMethodExit(opcode);
		if(opcode == RETURN) {
			mv.visitVarInsn(ALOAD, 0);
			mv.visitMethodInsn(INVOKESTATIC, ExceptionTracker.FQCN, ExceptionTracker.NAME_METHOD_TRACK, ExceptionTracker.TYPE_METHOD_TRACK);
			mv.visitEnd();
		}
	}

}
