

/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 5.0
 */
public class TeachableProgrammerTest
{
	public static void main(String[] args)
	{
		TeachableProgrammer tp = new TeachableProgrammer("���");
		//ֱ�ӵ���TeachableProgrammer���Programmer��̳е���work����
		tp.work();
		//�����ϵ��õ���Closure��work������
		//ʵ�����ǻص�TeachableProgrammer��teach����
		tp.getCallbackReference().work();
	}
}