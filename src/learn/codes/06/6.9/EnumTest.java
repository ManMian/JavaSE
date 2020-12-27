

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
public class EnumTest
{
	public void judge(SeasonEnum s)
	{
		// switch�����ı���ʽ������ö��ֵ
		switch (s)
		{
			case SPRING:
				System.out.println("��ů����������̤��");
				break;
			case SUMMER:
				System.out.println("�������ף��ʺ���Ӿ");
				break;
			case FALL:
				System.out.println("�����ˬ��������ʱ");
				break;
			case WINTER:
				System.out.println("����ѩƮ��Χ¯��ѩ");
				break;
		}
	}
	public static void main(String[] args)
	{
		// ö����Ĭ����һ��values���������ظ�ö���������ʵ��
		for (var s : SeasonEnum.values())
		{
			System.out.println(s);
		}
		// ʹ��ö��ʵ��ʱ����ͨ��EnumClass.variable��ʽ������
		new EnumTest().judge(SeasonEnum.SPRING);
	}
}