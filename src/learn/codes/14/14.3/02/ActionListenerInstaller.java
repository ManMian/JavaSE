
import java.lang.reflect.*;
import java.awt.event.*;
import javax.swing.*;
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
public class ActionListenerInstaller
{
	// ����ע��ķ���������obj�ǰ���ע��Ķ���
	public static void processAnnotations(Object obj)
	{
		try
		{
			// ��ȡobj�������
			Class cl = obj.getClass();
			// ��ȡָ��obj��������г�Ա������������ÿ����Ա����
			for (Field f : cl.getDeclaredFields())
			{
				// ���ó�Ա�������óɿ����ɷ��ʡ�
				f.setAccessible(true);
				// ��ȡ�ó�Ա������ActionListenerFor���͵�ע��
				ActionListenerFor a = f.getAnnotation(ActionListenerFor.class);
				// ��ȡ��Ա����f��ֵ
				Object fObj = f.get(obj);
				// ���f��AbstractButton��ʵ������a��Ϊnull
				if (a != null && fObj != null
					&& fObj instanceof AbstractButton)
				{
					// ��ȡaע�����listnerԪ���ݣ�����һ���������ࣩ
					Class<? extends ActionListener> listenerClazz = a.listener();
					// ʹ�÷���������listner��Ķ���
					ActionListener al = listenerClazz
						.getDeclaredConstructor().newInstance();
					var ab = (AbstractButton) fObj;
					// Ϊab��ť�����¼�������
					ab.addActionListener(al);
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}