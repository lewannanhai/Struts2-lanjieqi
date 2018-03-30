package com.intecepor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimerIntercepor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		//�����������ĵ�һ����
		
		
	//ִ��action֮ǰ	
	long start=System.currentTimeMillis();
	//����ǻ�����һ������ȥ�ͻ��������һ������������������һ����������ô�ͻ����Ŀ���action
	
	String result=invocation.invoke();
	//ִ����action֮����һ��ͳ��ʱ��
	
	long end=System.currentTimeMillis();
	
	System.out.println("�����˶೤ʱ��"+(end-start)+"ms");
	
	return result;
	
			
	}

}
