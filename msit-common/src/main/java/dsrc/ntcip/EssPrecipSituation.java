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


package dsrc.ntcip;

import com.oss.asn1.Enumerated;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type EssPrecipSituation from ASN1 Module NTCIP.
 * @see Enumerated
 */

public final class EssPrecipSituation extends Enumerated {
    
    /**
     * The default constructor.
     */
    private EssPrecipSituation()
    {
	super(cFirstNumber);
    }
    
    protected EssPrecipSituation(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long other = 1;
	public static final long unknown = 2;
	public static final long noPrecipitation = 3;
	public static final long unidentifiedSlight = 4;
	public static final long unidentifiedModerate = 5;
	public static final long unidentifiedHeavy = 6;
	public static final long snowSlight = 7;
	public static final long snowModerate = 8;
	public static final long snowHeavy = 9;
	public static final long rainSlight = 10;
	public static final long rainModerate = 11;
	public static final long rainHeavy = 12;
	public static final long frozenPrecipitationSlight = 13;
	public static final long frozenPrecipitationModerate = 14;
	public static final long frozenPrecipitationHeavy = 15;
    }
    // Named list definitions.
    private final static EssPrecipSituation cNamedNumbers[] = {
	new EssPrecipSituation(), 
	new EssPrecipSituation(2), 
	new EssPrecipSituation(3), 
	new EssPrecipSituation(4), 
	new EssPrecipSituation(5), 
	new EssPrecipSituation(6), 
	new EssPrecipSituation(7), 
	new EssPrecipSituation(8), 
	new EssPrecipSituation(9), 
	new EssPrecipSituation(10), 
	new EssPrecipSituation(11), 
	new EssPrecipSituation(12), 
	new EssPrecipSituation(13), 
	new EssPrecipSituation(14), 
	new EssPrecipSituation(15)
    };
    public static final EssPrecipSituation other = cNamedNumbers[0];
    public static final EssPrecipSituation unknown = cNamedNumbers[1];
    public static final EssPrecipSituation noPrecipitation = cNamedNumbers[2];
    public static final EssPrecipSituation unidentifiedSlight = cNamedNumbers[3];
    public static final EssPrecipSituation unidentifiedModerate = cNamedNumbers[4];
    public static final EssPrecipSituation unidentifiedHeavy = cNamedNumbers[5];
    public static final EssPrecipSituation snowSlight = cNamedNumbers[6];
    public static final EssPrecipSituation snowModerate = cNamedNumbers[7];
    public static final EssPrecipSituation snowHeavy = cNamedNumbers[8];
    public static final EssPrecipSituation rainSlight = cNamedNumbers[9];
    public static final EssPrecipSituation rainModerate = cNamedNumbers[10];
    public static final EssPrecipSituation rainHeavy = cNamedNumbers[11];
    public static final EssPrecipSituation frozenPrecipitationSlight = cNamedNumbers[12];
    public static final EssPrecipSituation frozenPrecipitationModerate = cNamedNumbers[13];
    public static final EssPrecipSituation frozenPrecipitationHeavy = cNamedNumbers[14];
    
    protected final static long cFirstNumber = 1;
    protected final static boolean cLinearNumbers = false;
    
    public Enumerated[] getNamedNumbers()
    {
	return cNamedNumbers;
    }
    
    public boolean hasLinearNumbers()
    {
	return cLinearNumbers;
    }
    
    public long getFirstNumber()
    {
	return cFirstNumber;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 1 && value <= 15)
	    return (int)(value - 1);
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static EssPrecipSituation valueOf(long value)
    {
	int inx = indexOfValue(value);
	
	if (inx < 0)
	    return null;
	else
	    return cNamedNumbers[inx];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int indexOf()
    {
	return indexOfValue(mValue);
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Enumerated lookupValue(long value)
    {
	return valueOf(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	new Tags (
	    new short[] {
		0x000a
	    }
	),
	new QName (
	    "dsrc.ntcip",
	    "EssPrecipSituation"
	),
	new QName (
	    "NTCIP",
	    "EssPrecipSituation"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "other",
		    1
		),
		new MemberListElement (
		    "unknown",
		    2
		),
		new MemberListElement (
		    "noPrecipitation",
		    3
		),
		new MemberListElement (
		    "unidentifiedSlight",
		    4
		),
		new MemberListElement (
		    "unidentifiedModerate",
		    5
		),
		new MemberListElement (
		    "unidentifiedHeavy",
		    6
		),
		new MemberListElement (
		    "snowSlight",
		    7
		),
		new MemberListElement (
		    "snowModerate",
		    8
		),
		new MemberListElement (
		    "snowHeavy",
		    9
		),
		new MemberListElement (
		    "rainSlight",
		    10
		),
		new MemberListElement (
		    "rainModerate",
		    11
		),
		new MemberListElement (
		    "rainHeavy",
		    12
		),
		new MemberListElement (
		    "frozenPrecipitationSlight",
		    13
		),
		new MemberListElement (
		    "frozenPrecipitationModerate",
		    14
		),
		new MemberListElement (
		    "frozenPrecipitationHeavy",
		    15
		)
	    }
	),
	0,
	other
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EssPrecipSituation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EssPrecipSituation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EssPrecipSituation
