

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
public class ContinueLabel
{
	public static void main(String[] args)
	{
		// ���ѭ��
		outer:
		for (var i = 0; i < 5; i++)
		{
			// �ڲ�ѭ��
			for (var j = 0; j < 3; j++)
			{
				System.out.println("i��ֵΪ:" + i + "  j��ֵΪ:" + j);
				if (j == 1)
				{
					// ����outer��ǩ��ָ����ѭ���б���ѭ����ʣ����䡣
					continue outer;
				}
			}
		}
	}
}