

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
public class ConstructorOverload
{
	public String name;
	public int count;
	// �ṩ�޲����Ĺ�����
	public ConstructorOverload(){}
	// �ṩ�����������Ĺ�������
	// �Ըù��������صĶ���ִ�г�ʼ��
	public ConstructorOverload(String name, int count)
	{
		this.name = name;
		this.count = count;
	}
	public static void main(String[] args)
	{
		// ͨ���޲�������������ConstructorOverload����
		var oc1 = new ConstructorOverload();
		// ͨ���в�������������ConstructorOverload����
		var oc2 = new ConstructorOverload(
			"������Java EE��ҵӦ��ʵս", 300000);
		System.out.println(oc1.name + " " + oc1.count);
		System.out.println(oc2.name + " " + oc2.count);
	}
}
