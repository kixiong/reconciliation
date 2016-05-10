package com.froad.comon.mail;

import com.froad.comon.util.PropertyUtil;
import org.apache.commons.lang.BooleanUtils;

import java.util.Properties;

public class MailSenderInfo {
	// 是否需要身份验证
	private boolean validate = false;
	// 协议
	private String protocol;
	// 发送邮件的服务器的IP和端口
	private String mailServerHost;
	private String mailServerPort = "25";
	// 邮件发送者的地址
	private String fromAddress;
	// 邮件接收者的地址
	private String toAddress;
	// 登陆邮件发送服务器的用户名和密码
	private String userName;
	private String password;
	// 邮件主题
	private String subject;
	// 邮件的文本内容
	private String content;
	// 邮件附件的文件名
	private String[] attachFileNames;

	/**
	 * 获得邮件会话属性
	 */
	public Properties getProperties() {
		this.validate = BooleanUtils.toBooleanObject(PropertyUtil.getProperties("mail.smtp.auth"));
		this.protocol = PropertyUtil.getProperties("mail.transport.protocol");
		this.mailServerHost = PropertyUtil.getProperties("mail.smtp.host");
		this.mailServerPort = PropertyUtil.getProperties("mail.smtp.port");
		this.userName = PropertyUtil.getProperties("mail.host.user");
		this.password = PropertyUtil.getProperties("mail.host.user.password");
		this.fromAddress = PropertyUtil.getProperties("mail.host.user.from");
		Properties p = new Properties();
		p.put("mail.smtp.auth", validate ? "true" : "false");
		p.put("mail.transport.protocol", this.protocol);
		p.put("mail.smtp.host", this.mailServerHost);
		p.put("mail.smtp.port", this.mailServerPort);
		return p;
	}

	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getMailServerHost() {
		return mailServerHost;
	}

	public void setMailServerHost(String mailServerHost) {
		this.mailServerHost = mailServerHost;
	}

	public String getMailServerPort() {
		return mailServerPort;
	}

	public void setMailServerPort(String mailServerPort) {
		this.mailServerPort = mailServerPort;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String[] getAttachFileNames() {
		return attachFileNames;
	}

	public void setAttachFileNames(String[] attachFileNames) {
		this.attachFileNames = attachFileNames;
	}
}