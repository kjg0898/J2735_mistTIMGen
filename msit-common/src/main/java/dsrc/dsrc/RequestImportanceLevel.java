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


package dsrc.dsrc;

import com.oss.asn1.Enumerated;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type RequestImportanceLevel from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class RequestImportanceLevel extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RequestImportanceLevel()
    {
	super(cFirstNumber);
    }
    
    protected RequestImportanceLevel(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long requestImportanceLevelUnKnown = 0;
	public static final long requestImportanceLevel1 = 1;
	public static final long requestImportanceLevel2 = 2;
	public static final long requestImportanceLevel3 = 3;
	public static final long requestImportanceLevel4 = 4;
	public static final long requestImportanceLevel5 = 5;
	public static final long requestImportanceLevel6 = 6;
	public static final long requestImportanceLevel7 = 7;
	public static final long requestImportanceLevel8 = 8;
	public static final long requestImportanceLevel9 = 9;
	public static final long requestImportanceLevel10 = 10;
	public static final long requestImportanceLevel11 = 11;
	public static final long requestImportanceLevel12 = 12;
	public static final long requestImportanceLevel13 = 13;
	public static final long requestImportanceLevel14 = 14;
	public static final long requestImportanceReserved = 15;
    }
    // Named list definitions.
    private final static RequestImportanceLevel cNamedNumbers[] = {
	new RequestImportanceLevel(), 
	new RequestImportanceLevel(1), 
	new RequestImportanceLevel(2), 
	new RequestImportanceLevel(3), 
	new RequestImportanceLevel(4), 
	new RequestImportanceLevel(5), 
	new RequestImportanceLevel(6), 
	new RequestImportanceLevel(7), 
	new RequestImportanceLevel(8), 
	new RequestImportanceLevel(9), 
	new RequestImportanceLevel(10), 
	new RequestImportanceLevel(11), 
	new RequestImportanceLevel(12), 
	new RequestImportanceLevel(13), 
	new RequestImportanceLevel(14), 
	new RequestImportanceLevel(15)
    };
    public static final RequestImportanceLevel requestImportanceLevelUnKnown = cNamedNumbers[0];
    public static final RequestImportanceLevel requestImportanceLevel1 = cNamedNumbers[1];
    public static final RequestImportanceLevel requestImportanceLevel2 = cNamedNumbers[2];
    public static final RequestImportanceLevel requestImportanceLevel3 = cNamedNumbers[3];
    public static final RequestImportanceLevel requestImportanceLevel4 = cNamedNumbers[4];
    public static final RequestImportanceLevel requestImportanceLevel5 = cNamedNumbers[5];
    public static final RequestImportanceLevel requestImportanceLevel6 = cNamedNumbers[6];
    public static final RequestImportanceLevel requestImportanceLevel7 = cNamedNumbers[7];
    public static final RequestImportanceLevel requestImportanceLevel8 = cNamedNumbers[8];
    public static final RequestImportanceLevel requestImportanceLevel9 = cNamedNumbers[9];
    public static final RequestImportanceLevel requestImportanceLevel10 = cNamedNumbers[10];
    public static final RequestImportanceLevel requestImportanceLevel11 = cNamedNumbers[11];
    public static final RequestImportanceLevel requestImportanceLevel12 = cNamedNumbers[12];
    public static final RequestImportanceLevel requestImportanceLevel13 = cNamedNumbers[13];
    public static final RequestImportanceLevel requestImportanceLevel14 = cNamedNumbers[14];
    public static final RequestImportanceLevel requestImportanceReserved = cNamedNumbers[15];
    
    protected final static long cFirstNumber = 0;
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
	if (value >= 0 && value <= 15)
	    return (int)value;
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static RequestImportanceLevel valueOf(long value)
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
	    "dsrc.dsrc",
	    "RequestImportanceLevel"
	),
	new QName (
	    "DSRC",
	    "RequestImportanceLevel"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "requestImportanceLevelUnKnown",
		    0
		),
		new MemberListElement (
		    "requestImportanceLevel1",
		    1
		),
		new MemberListElement (
		    "requestImportanceLevel2",
		    2
		),
		new MemberListElement (
		    "requestImportanceLevel3",
		    3
		),
		new MemberListElement (
		    "requestImportanceLevel4",
		    4
		),
		new MemberListElement (
		    "requestImportanceLevel5",
		    5
		),
		new MemberListElement (
		    "requestImportanceLevel6",
		    6
		),
		new MemberListElement (
		    "requestImportanceLevel7",
		    7
		),
		new MemberListElement (
		    "requestImportanceLevel8",
		    8
		),
		new MemberListElement (
		    "requestImportanceLevel9",
		    9
		),
		new MemberListElement (
		    "requestImportanceLevel10",
		    10
		),
		new MemberListElement (
		    "requestImportanceLevel11",
		    11
		),
		new MemberListElement (
		    "requestImportanceLevel12",
		    12
		),
		new MemberListElement (
		    "requestImportanceLevel13",
		    13
		),
		new MemberListElement (
		    "requestImportanceLevel14",
		    14
		),
		new MemberListElement (
		    "requestImportanceReserved",
		    15
		)
	    }
	),
	0,
	requestImportanceLevelUnKnown
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RequestImportanceLevel object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RequestImportanceLevel object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RequestImportanceLevel
