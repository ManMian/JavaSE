

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
public class PrimitiveTransferTest
{
	public static void swap(int a, int b)
	{
		// �������д���ʵ��a��b������ֵ������
		// ����һ����ʱ����������a������ֵ
		var tmp = a;
		// ��b��ֵ����a
		a = b;
		// ����ʱ����tmp��ֵ����b
		b = tmp;
		System.out.println("swap�����a��ֵ��"
			+ a + "��b��ֵ��" + b);
	}
	public static void main(String[] args)
	{
		var a = 6;
		var b = 9;
		swap(a, b);
		System.out.println("���������󣬱���a��ֵ��"
			+ a + "������b��ֵ��" + b);
	}
}