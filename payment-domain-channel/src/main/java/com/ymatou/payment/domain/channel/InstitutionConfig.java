package com.ymatou.payment.domain.channel;

import org.springframework.stereotype.Component;

import com.baidu.disconf.client.common.annotations.DisconfFile;

/**
 * 第三方支付机构配置（Disconf托管）
 * @author wangxudong
 *
 */
@Component
public class InstitutionConfig {

	/**
	 * 支付渠道代码
	 */
	private String payType;
	
	/**
	 * 商户号
	 */
	private String merchantId;
	
	/**
	 * 签名方式
	 */
	private String signType;
	
	/**
	 * 第三方机构名称
	 */
	private String instName;
	
	/**
	 * 微信AppId
	 */
	private String appId;
	
	/**
	 * 第三方机构公钥
	 */
	private String instPublicKey;
	
	/**
	 * YMT私钥
	 */
	private String instYmtPrivateKey;
	
	/**
	 * MD5盐值
	 */
	private String md5Key;

	/**
	 * @return the payType
	 */
	public String getPayType() {
		return payType;
	}

	/**
	 * @param payType the payType to set
	 */
	public void setPayType(String payType) {
		this.payType = payType;
	}

	/**
	 * @return the merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * @param merchantId the merchantId to set
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * @return the signType
	 */
	public String getSignType() {
		return signType;
	}

	/**
	 * @param signType the signType to set
	 */
	public void setSignType(String signType) {
		this.signType = signType;
	}

	/**
	 * @return the instName
	 */
	public String getInstName() {
		return instName;
	}

	/**
	 * @param instName the instName to set
	 */
	public void setInstName(String instName) {
		this.instName = instName;
	}

	/**
	 * @return the appId
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId the appId to set
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * @return the instPublicKey
	 */
	public String getInstPublicKey() {
		return instPublicKey;
	}

	/**
	 * @param instPublicKey the instPublicKey to set
	 */
	public void setInstPublicKey(String instPublicKey) {
		this.instPublicKey = instPublicKey;
	}

	/**
	 * @return the instYmtPrivateKey
	 */
	public String getInstYmtPrivateKey() {
		return instYmtPrivateKey;
	}

	/**
	 * @param instYmtPrivateKey the instYmtPrivateKey to set
	 */
	public void setInstYmtPrivateKey(String instYmtPrivateKey) {
		this.instYmtPrivateKey = instYmtPrivateKey;
	}

	/**
	 * @return the md5Key
	 */
	public String getMd5Key() {
		return md5Key;
	}

	/**
	 * @param md5Key the md5Key to set
	 */
	public void setMd5Key(String md5Key) {
		this.md5Key = md5Key;
	}
	
	
}
