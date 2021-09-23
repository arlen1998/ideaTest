import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 *
 * @author shen.joe
 *
 * @date 2017年3月30日
 *
 */
public class RSA2Utils {

	private static Logger logger = LoggerFactory.getLogger(RSA2Utils.class);

//	private static String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCrCrwp0eiHg6imPpOAvMO7LzH72g2tIlEpZs6wqlf5UsDy/a4a+cOieVpdiyVd69Vxm0qUJQlBCGfqkAtEXJIFOUHHSgqc7r/nhY/wL5K0ff+5DbQuOUik+bI0Jvpv6pjmFJSVdukNGvqdJ7eGKkkjfGayrFJXFx4wezh+38QCDQIDAQAB";
//	//
//	private static String privateKey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKsKvCnR6IeDqKY+k4C8w7svMfvaDa0iUSlmzrCqV/lSwPL9rhr5w6J5Wl2LJV3r1XGbSpQlCUEIZ+qQC0RckgU5QcdKCpzuv+eFj/AvkrR9/7kNtC45SKT5sjQm+m/qmOYUlJV26Q0a+p0nt4YqSSN8ZrKsUlcXHjB7OH7fxAINAgMBAAECgYBSDRlM+oyRDcDG13gNJwDCeBaDWgx7hN3ofZAjwePoECHNr5JpEG4gMBUAkPLBBpRjJnr1bHru/qhTJvyws7O8EhbE0/icpaIJaT2yGSlmyuDFiYO6TZH5ulGe099tn/eZb07gTH8AoONIU4RmPJInAxAaXuAtfm4BYKqzsl3joQJBAOZGykL1hUmiAU2xtAvVK/M9d1CQ5sjJDUOU7vlDUGtIuW13BOeM1mmuR9DCdO1nKHdjrc3js1UzsfOCEYqD3fkCQQC+JgPvUXlW+S7qGpxUw4jyZ0AAiIDLaPQOUmqyROR3n+WXfKzcdiOfhfU3Uy7rHCwLm0KybJ4FIV6tqD1MYNm1AkBYM1kZWI0a7PBu39fEiHvzCOIAe9/JnCh2cD8wPjY5QXu0j9fTEMC3bceYEENVAyQexpE1wTdZNRm92V36nhORAkEAniPtt9aRzOS2wNpa1CA/QCLg1tCwFPv3pgWjWRn0zQx9nOyCs2PJor19QIL9DWpDs29wHAY7sdab8F9wg5o01QJBAIXxKyM99N8A7Vg6bVrDsknfhnWTUAGq161z3ZYDsLsjFmG1puQPz1PqRGRI3d0h443ZAEfvtWx+5diJ43aRiNA=";


	//mall-api
//	private static String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCE2SGJChi5c63vUYgRfd1nZYIxi3pmHdMoLZ0L5LSC7wdAgfQeQ8zYgu5DTDFF7WFL8f5sjJ0c0ldTCouZse7wp4i+clacD20jBDfBt93ubkEXvQCOfSTLIGWGvKe5GqkmjjHeeVf/5O0PI4VuwhBXP9SLhE9PS34X3YDlI0clZwIDAQAB";
//
//	private static String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAITZIYkKGLlzre9RiBF93WdlgjGLemYd0ygtnQvktILvB0CB9B5DzNiC7kNMMUXtYUvx/myMnRzSV1MKi5mx7vCniL5yVpwPbSMEN8G33e5uQRe9AI59JMsgZYa8p7kaqSaOMd55V//k7Q8jhW7CEFc/1IuET09LfhfdgOUjRyVnAgMBAAECgYBNTnFGZtq2aIup/T76Ns01UwutOyYx8F8lPU3rUt58Zw5ISpc9WWUGBUMTZG4z7Aw3fo34qubuk7R/PV65RKLvCaw11lMo5SdfgKEu1qTAHK1ONG9H6Wb797YTdHt13g5MoopR/C4HlscmKCX+kx1tbKoAczEpWsNRWMircLYMWQJBAOgOMHnFsn5Weiy3B+Kfg6nVWn+L+s8bWIVCyQZbv7JqLCiV1j/YkvGekJs1ExhcGCnBiDIPNKLmnxJU5h4nsUMCQQCSjlp7PbbkEzmX2w4GKxYXVSUv4sheljdLjpr6JhKEB0yAE+cnnzRsr7UJgR7b690fD0Q86dz4SwcN0JogX3cNAkArz4n9Y4K4cXEtgfy+H2mHJd2pGO9oLHyA5EP5rFa7w2nE280QTr4nWc1pUBLj1XdGYuBouxAv9SRxHJA5fzrrAkA3J4u1xcwGmZWbKL1mZOCzdz+/fcGalz3IGasJaTqepYCM0vCzYJ8CKD4hjY5nhaR6A+zSX9DhQJsu/8qBVGwhAkEAsO9Ek0IqPXbGz47whV8cYLEtb/2FiZ0h/BtccaSbTiN2x2J6y4VZjAcyrFmITnpN8RRgT103+bQC1En/qrvInA==";



	//国网给江苏配置的，用来加密手机号的
	private static String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCpV5+41cxWPv/zXr/XuY81n6mb8/+/YmAMwsQa92L8WYlHlRmIg/5bhsH+Y7AxXHLXLaryPQ1mMqFtm7BMC07IepIH72KGzXjRI2Qh0WV07NoRo7lDDUUyLRaYe4faY1STttwB8v0YXV9OQY8hTMUNHMTHwLiiD8FsDSZRLmSQtQIDAQAB";

	private static String privateKey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKlXn7jVzFY+//Nev9e5jzWfqZvz/79iYAzCxBr3YvxZiUeVGYiD/luGwf5jsDFcctctqvI9DWYyoW2bsEwLTsh6kgfvYobNeNEjZCHRZXTs2hGjuUMNRTItFph7h9pjVJO23AHy/RhdX05BjyFMxQ0cxMfAuKIPwWwNJlEuZJC1AgMBAAECgYATopxbgzbJPU7SOkdGTTbEwfmZoqYh29dFQ4QXmF264urfCPPH934TwMFXrNluL8kFGD99DQUzt2UuX2IGvzzoIxt0edu5/TDnNSqoBltY32QJhksNGugMgsiLQWZUgZsBVEcHmrYJ2QF3QTo5hQbGPP2BAzzxRWoao0+YnSezgQJBAPS+FndF9X+emuPSEuwGOpwgIyjE23b8ikNTpaRgAgw5m3umSambdzM/3yFQj1zcBg/t8AaLJnrvqq5u4Sg+eZUCQQCxIa1OdzH30LLCWrwn/t7cCCjRYV+9MGLSyLVCbyrHThPYsTFWs05BW33+M+Y3uXvj6ozp2T51Ri55OLy1LzKhAkEA3eNNCPwDVJ3ePbhi8VvAXXYBil/XvWu+isXWgk2M7bp4zcT4Oe46Rtucl16ra3wLfvuwxq33yDNr4lOijNL/dQJAeoTzziluO550dzCxouyNFB7ktOcohMD6KhhAICKqsU8VNTZjDThbMaPqQzF81SCMTDrJm1rz88RGkvymsqBh4QJBAKLGVmEtyDoML+Ctwsv5IHx7aVNtxAdlLPdnLbj9zgn3J6WbQFiZMMx5chpSdoGqROybwEPB55wgr8RHg1OEugY=";


	public  enum CharSet {
		UTF8 {
			public String getName() {
				return "UTF-8";
			}
		};
		public abstract String getName();
	}

	/**
	 * 创建公钥  私钥
	 * @return
	 */
	public static Map<String, Object> createRSAKey() {
		Map<String, Object> keyMap = null;
		try {
			keyMap = RSA2InsideTools.genKeyPair();
			logger.info("公钥-->"+RSA2InsideTools.getPublicKey(keyMap));
			logger.info("私钥-->"+RSA2InsideTools.getPrivateKey(keyMap));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.info("获取公私钥失败，错误信息"+e.getMessage());
			e.printStackTrace();
		}
		return keyMap;
	}

	/**
	 * 根据公钥加密
	 * @param content 需加密内容
	 * @return
	 */
	public static String encryptByPublicKey(String content, String publicKey) {
		byte[] b=null;
		try {
			b = encrypt(content.getBytes(CharSet.UTF8.getName()),true,publicKey);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("不支持的编码格式，错误信息"+e.getMessage());
		}
		return bytesToString(b);
	}

	/**
	 * 根据私钥加密
	 * @param content
	 * @return
	 */
	public static String encryptByPrivateKey(String content,String privateKey) {
		byte[] b=null;
		try {
			b = encrypt(content.getBytes(CharSet.UTF8.getName()),false,privateKey);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("不支持的编码格式，错误信息"+e.getMessage());
		}
		return bytesToString(b);
	}

	/**
	 * 根据私钥 解密
	 * @param content  解密内容
	 * @return
	 */
	public  static String decryptByPrivateKey(String content,String  privateKey) {

		byte[] b = decrypt(stringToBytes(content),false,privateKey);
		try {
			if (b == null){
				return null;
			}
			return new String(b, CharSet.UTF8.getName());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("不支持的编码格式，错误信息"+e.getMessage());
		}
		return null;
	}

	/**
	 * 根据公钥 解密
	 * @param content
	 * @return
	 */
	public  static String decryptByPublicKey(String content, String publicKey) {

		byte[] b = decrypt(stringToBytes(content),true,publicKey);
		try {
			return new String(b, CharSet.UTF8.getName());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("不支持的编码格式，错误信息"+e.getMessage());
		}
		return null;
	}

	/**
	 * 字符串转换成为字节数组
	 * @param decrytString
	 * @return
	 */
	private  static byte[] stringToBytes(String decrytString) {

		char[] charHex=decrytString.toCharArray();
		byte[] clone=null;
		try {
			clone = Hex.decodeHex(charHex);
		} catch (DecoderException e) {
			// TODO Auto-generated catch block
			logger.info("字符串转换字节数组失败，错误信息"+e.getMessage());
			e.printStackTrace();
		}
		return clone;
	}

	/**
	 * 字节数组转换为字符串
	 * @return
	 */
	private  static String bytesToString(byte[] encrytpByte) {
		char[] charHex= Hex.encodeHex(encrytpByte);
		return new String(charHex);
	}

	/**
	 * 加密
	 * @param data
	 * @return
	 */
	private static byte[] encrypt(byte[] data,boolean isPublicKey,String key) {
		try {

			if(isPublicKey){
				return RSA2InsideTools.encryptByPublicKey(data, key);
			}
			return RSA2InsideTools.encryptByPrivateKey(data, key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.info("加密失败，错误信息"+e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 解密
	 * @param data
	 * @return
	 */
	private static byte[] decrypt(byte[] data,boolean isPublicKey,String key) {

		try {
			if(isPublicKey){
				return RSA2InsideTools.decryptByPublicKey(data, key);
			}
			return RSA2InsideTools.decryptByPrivateKey(data, key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.info("私钥解密失败，错误信息"+e.getMessage());
		}

		return null;
	}


//	public static void main(String[] args) throws Exception {
//		String str = "a79aef82eeee57cafd6368840e3588ab1454ea3b4d9ad743df83b431286dd7ae644d4a9f32ffaa1bc982a715b77c9071a44dd4f85c38a0d188ebce3de125d103b43f0a4de98454898d32fce2fe1ca2f50ffb9eef70a0c01ac76d882242c8f86b1c4033d04f86d391cbc404445e854c01304e12bac027a379d8ccb70a34cc3872488e17c9c182377a35593822882699a82e2597d8ff6fd804953e826c4702d4288969953645c6be39e8ba57f510f67fc476272821626ceedd45a5db732c0a5e420d83d61ed482ae1d35d897b8a354049c7da9ec5b7ad45f1ee28cf3b6e8e225cdded1fdec9d19c328205e30185645f86a6774c16898ec6cc3de1e13930885789c";
////		String s  = encryptByPublicKey(str, publicKey);
////		System.out.println(s);
//		String s1 = decryptByPrivateKey(str, privateKey);
//		System.out.println(s1);
////		JSONObject jsonObject = JSONObject.parseObject(s1);
////		System.out.println(jsonObject.entrySet());
//		System.out.println(privateKey.length());
//	}

	public static void main(String[] args) throws Exception {

		String str = "{\"platformNo\":\"WSGW_41101\",\"openId\":\"5efdf2b94bb54d19a1e062b9403dae72\",\"consNo\": \"3980198325\",\"provinceCode\": \"41101\",\"orgNo\": \"41401\",\"businessId\": \"12313233457\",\"channelNo\":\"4\",\"type\":\"\",\"cityNum\":\"\",\"catId\":\"\",\"pageSize\":\"2\",\"currentPage\":\"1\"}";
//		String str = "15910825662";
		System.out.println("原始字符串：" + str);
		String s  = encryptByPublicKey(str, publicKey);
		System.out.println("加密的字符串：" + s);
		String s1 = decryptByPrivateKey(s, privateKey);
		System.out.println("解密的字符串：" + s1);

//		String ss  = "7d011a38c1689681685c5f1f131ab65df5af18e754c0414c9a462d3dbf83c70e8c621f99bcaef6e191d91af11a1bc0302c9f733fb4cd42cdb6d9b737059854b0b8fea79d5e0b4015a2948112b7f1147629425201f4c2f57bd55c14234473b1379dfb344563d987cb2f34112aa0755287f4fc6617a13393f8209614ecace16b3f7b929f9a7a279cfb58e30e78cc22129ea72425063d42bc86a441593d3475be9bd50ef00cb7f21aafdd60ec1807cf99e45a4863741120795e5a11e7b1fcdc58c5c4f7e7fcc0fe1b1939f550bcb7a9763459f8e2990002d8996f53505713906b178474c9327ad84a18889847dfe4851ece451620f0125740ccb4ca612d5e5bca3d46590033c02f0b8fa30eff9afb0c8ace73aaaef021ff96b879e96f8f1a22717b5d47c5e2775caa3584898d7fe450933b4bd7f3be67236734f34c67519e210f51e8d0f7ff7a216980aa39a23b4e945f3c09015d89dc6ec1093d4d909336dd205280b490513d5fb8df3172b87db4eb127c9646fcde9f76974dfdec6ed5f1abca4d75d4ab34be063feaa70492fbe723168440f27306d10b7eaaa2f334f0276d428c31109ce07a15734263cbb2b08cfc654df1fc23589dffd7f518cf8f237041f3636226fc786b7b3932c5ce85b597e3c394cc515cc28ce587162f1910b41042baeae9f9667c563a9a65b07f8824a0c8a3fff6bee5b158b901660b5f6f1a6c05a8e7445b64a4f33e37b79355f63bde01c5561ed0fe5202613c0a576689707e770639c51e0af4675e9827fc643609084446af5d5ff8f8b812c5458b0f1a0b432aad9c45f72a740b70467e138adc169eae904e5f8c65f69c50e6d27677d9825c39a6f54cb48d11f6877526c9164b4518fa2831f2b4985bcf58b610cae576ae2459089568a5dc411a3d6a6daa80a71cb87c29697d448c1f787e42acb9c476200886d1fcc303c4c3d987161f9e92825d4b73d3bc04c5d83e4f6802f2eb598feeeb6e12952b47635273a119c3bceb03e06170c4d97cd2989ac53ff26d4ca02add008d04ef2d9767febcb0d842feef2792bc5d6ed06a2b9eca7c229222cc3ccb8be40c527580b097bdab0689b8363fdc1aae00e34762a757b7751ad104125b08bb3a4382c54c7ae70620057687244551dfd318344df4ea6b96e98b278e023a791243ef23d8f5ccdc7ce50c491fe0678c8c061a5d0f51fbb5a1e711c44a80972b43f1c1d41579a0b19447f75db501e512cd2dd2c762aca09b3c371885e05540c70f6a5f0a736e8ddd5a18d23f03454e313c936dde3419f36b82ad1abdc6ed9764f4fdb033a48a3dfe7a4817586b914f636e5075a0ac2a5130e3aacbb0f1d9dbe24fe21e775da2e987deccf15dcc6cab580879f699fde46c2ebbdffc07573b4eee11869226c6b142652d9fe915e9410aef944ae8fd51ac34cfef10e3eb04f5c0768d532462bf845b342230ddb3ac7e18666fac8646ba87e7e7b6351da02d09a2fcca6f6bfe9a69936ebcee4c0f8fc4ba10cd80b8a4ce1b462feab69bcf585f3905ecf9f073fc0de816b43a904edffc6134c13338204cf5acedb3e97b3008b86caa1bbf95352ac9468e757d873e42fba9cc2fc16275c5202c3546031c3d7fcfb7ac5fc44e41ad";
//		System.out.println("加密的字符串：" + ss);
//		String ss1 = decryptByPublicKey(ss, publicKey);
//		System.out.println("解密的字符串：" + ss1);
	}
}
