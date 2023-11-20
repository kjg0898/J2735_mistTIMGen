/*************************************************************/
/* Copyright (C) 2023 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Neighbor System, Site-based, License 17353 17353,
 * at 16th Fl. IT Venture Tower (East), 135, Jungdae-ro, Songpa-Gu, Seoul 05717, Korea. */
/* Abstract syntax: j2735_cits_20201125 */
/* ASN.1 Java project: dsrc.Dsrc */
/* Created: Wed Jul 12 11:40:42 2023 */
/* ASN.1 Compiler for Java version: 7.2 */
/* ASN.1 compiler options and file names specified:
 * -output dsrc -nouniquepdu -per -uper -ber -der -cer -json -root
 * -pdusforopentypes -messageFormat msvc
 * D:/OSS_ASN1/Project/POLICE/J2735_CITS_20201125.asn
 * C:/Users/Administrator/AppData/Local/Temp/2/asn1studio.Administrator.9592/ossSamplePOLICE/J2735_CITS_20201125.asn
 */


package dsrc;

import com.oss.asn1.*;
import com.oss.metadata.ProjectInfo;
import com.oss.metadata.XERInfo;

public class Dsrc extends XASN1Project {

    /**
     * Initialize the pdu decoder.
     */
    private static final ProjectInfo c_projectInfo = new ProjectInfo (
	null,
	new byte[] {
	    (byte)0x0b, (byte)0x6c, (byte)0xef, (byte)0xe4, (byte)0x06,
	    (byte)0x86, (byte)0x41, (byte)0xcf, (byte)0x80, (byte)0x87,
	    (byte)0x41, (byte)0xcf, (byte)0x80, (byte)0x1f, (byte)0xd1,
	    (byte)0xd8, (byte)0x5a, (byte)0x8d, (byte)0xe1, (byte)0xb0,
	    (byte)0x65, (byte)0x3f, (byte)0x1f, (byte)0xae, (byte)0xb3,
	    (byte)0xf4, (byte)0xc4, (byte)0x76, (byte)0x8c, (byte)0x9d,
	    (byte)0x07, (byte)0x6a, (byte)0xc0, (byte)0xfd, (byte)0x33,
	    (byte)0x13, (byte)0xe6, (byte)0x18, (byte)0x68, (byte)0x00,
	    (byte)0xce, (byte)0xbc, (byte)0xd0, (byte)0x85, (byte)0x9c,
	    (byte)0x6e, (byte)0x12, (byte)0x4a, (byte)0xb5, (byte)0x5a,
	    (byte)0x83, (byte)0xed, (byte)0x9b, (byte)0xd4, (byte)0xb7,
	    (byte)0x14, (byte)0xc5, (byte)0xbe, (byte)0xd5, (byte)0xd0,
	    (byte)0x5c, (byte)0xf8, (byte)0xf7, (byte)0xec, (byte)0x13,
	    (byte)0x2f, (byte)0x2b, (byte)0xa1, (byte)0x5a, (byte)0xbb,
	    (byte)0x23, (byte)0x00, (byte)0xf3, (byte)0x8b, (byte)0x99,
	    (byte)0xfc, (byte)0x93, (byte)0x8c, (byte)0x1b, (byte)0x1b,
	    (byte)0x56, (byte)0x8a, (byte)0x7a
	}
    );
    
    /**
     * Get the project descriptor of 'this' object.
     */
    public ProjectInfo getProjectInfo()
    {
	return c_projectInfo;
    }
    
    /**
     * Initialize XER specific project info.
     */
    private static final XERInfo c_XERInfo = new XERInfo (
	null
    );
    
    /**
     * Get the XERInfo project descriptor of 'this' object.
     */
    public XERInfo getXERInfo()
    {
	return c_XERInfo;
    }
    
    private static final ASN1Project c_project = new Dsrc();

    /**
     * Methods for accessing Coders.
     */
    public static Coder getDefaultCoder()
    {
	return createBERCoder(c_project);
    }
    
    public static BERCoder getBERCoder()
    {
	return createBERCoder(c_project);
    }
    
    public static CERCoder getCERCoder()
    {
	return createCERCoder(c_project);
    }
    
    public static DERCoder getDERCoder()
    {
	return createDERCoder(c_project);
    }
    
    public static PERAlignedCoder getPERAlignedCoder()
    {
	return createPERAlignedCoder(c_project);
    }
    
    public static PERUnalignedCoder getPERUnalignedCoder()
    {
	return createPERUnalignedCoder(c_project);
    }
    
    public static JSONCoder getJSONCoder()
    {
	return createJSONCoder(c_project);
    }
    
}
