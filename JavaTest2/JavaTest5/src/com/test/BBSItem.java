package com.test;

public class BBSItem {
	
	static int seqNo; 			//�Ϸù�ȣ �ʵ�
	String writer; 			//�ۼ��� �ʵ�
	String writtenDate;			//�ۼ����� �ʵ�
	String title;			//�����ʵ�
	String content;			//�����ʵ�
	void BBSItem( String writer, String writtenDate, String title, String content){//������
		this.seqNo++;
		this.writer=writer;
		this.writtenDate=writtenDate;
		this.title=title;
		this.content=content;
		System.out.println(this.seqNo);
	}
	public static void main(String[] args) {
		BBSItem a =new BBSItem();
		a.BBSItem("ȫ�浿", "0410","����", "����");
		BBSItem b =new BBSItem();
		b.BBSItem("ȫ�浿2", "0411","����", "����");
		BBSItem c =new BBSItem();
		c.BBSItem("ȫ�浿3", "0412","����", "����");
		BBSItem d =new BBSItem();
		d.BBSItem("ȫ�浿3", "0413","����", "����");
	}
}
