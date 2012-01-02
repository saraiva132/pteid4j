package pt.up.pteid4j.pkcs11;

/**
 * PTeID4J PKCS#11 Constants Abstract Class
 * 
 * @author Andre Barbosa (andremanuelbarbosa@gmail.com)
 */
public abstract class PTeID4JPKCS11Constants {

  public static final byte[] DIGEST_INFO_PREFIX_SHA1 = new byte[] { 0x30, 0x1F, 0x30, 0x07, 0x06, 0x05, 0x2B, 0x0E, 0x03, 0x02,
      0x1A, 0x04, 0x14 };

  public static final byte[] DIGEST_INFO_PREFIX_SHA224 = new byte[] { 0x30, 0x2B, 0x30, 0x0B, 0x06, 0x09, 0x60, (byte) 0x86, 0x48,
      0x01, 0x65, 0x03, 0x04, 0x02, 0x04, 0x04, 0x1C };

  public static final byte[] DIGEST_INFO_PREFIX_SHA256 = new byte[] { 0x30, 0x2F, 0x30, 0x0B, 0x06, 0x09, 0x60, (byte) 0x86, 0x48,
      0x01, 0x65, 0x03, 0x04, 0x02, 0x01, 0x04, 0x20 };

  public static final byte[] DIGEST_INFO_PREFIX_SHA384 = new byte[] { 0x30, 0x3F, 0x30, 0x0B, 0x06, 0x09, 0x60, (byte) 0x86, 0x48,
      0x01, 0x65, 0x03, 0x04, 0x02, 0x02, 0x04, 0x30 };

  public static final byte[] DIGEST_INFO_PREFIX_SHA512 = new byte[] { 0x30, 0x4F, 0x30, 0x0B, 0x06, 0x09, 0x60, (byte) 0x86, 0x48,
      0x01, 0x65, 0x03, 0x04, 0x02, 0x03, 0x04, 0x40 };

  public static final byte[] DIGEST_INFO_PREFIX_RIPEMD160 = new byte[] { 0x30, 0x1F, 0x30, 0x07, 0x06, 0x05, 0x2B, 0x24, 0x03,
      0x02, 0x01, 0x04, 0x14 };

  public static final byte[] DIGEST_INFO_PREFIX_RIPEMD128 = new byte[] { 0x30, 0x1B, 0x30, 0x07, 0x06, 0x05, 0x2B, 0x24, 0x03,
      0x02, 0x02, 0x04, 0x10 };

  public static final byte[] DIGEST_INFO_PREFIX_RIPEMD256 = new byte[] { 0x30, 0x2B, 0x30, 0x07, 0x06, 0x05, 0x2B, 0x24, 0x03,
      0x02, 0x03, 0x04, 0x20 };
}
