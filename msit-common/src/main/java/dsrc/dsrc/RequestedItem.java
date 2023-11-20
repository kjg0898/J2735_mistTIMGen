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
 * Define the ASN1 Type RequestedItem from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class RequestedItem extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RequestedItem()
    {
	super(cFirstNumber);
    }
    
    protected RequestedItem(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long reserved = 0;
	public static final long itemA = 1;
	public static final long itemB = 2;
	public static final long itemC = 3;
	public static final long itemD = 4;
	public static final long itemE = 5;
	public static final long itemF = 6;
	public static final long itemG = 7;
	public static final long itemI = 8;
	public static final long itemJ = 9;
	public static final long itemK = 10;
	public static final long itemL = 11;
	public static final long itemM = 12;
	public static final long itemN = 13;
	public static final long itemO = 14;
	public static final long itemP = 15;
	public static final long itemQ = 16;
	
    }
    // Named list definitions.
    private final static RequestedItem cNamedNumbers[] = {
	new RequestedItem(), 
	new RequestedItem(1), 
	new RequestedItem(2), 
	new RequestedItem(3), 
	new RequestedItem(4), 
	new RequestedItem(5), 
	new RequestedItem(6), 
	new RequestedItem(7), 
	new RequestedItem(8), 
	new RequestedItem(9), 
	new RequestedItem(10), 
	new RequestedItem(11), 
	new RequestedItem(12), 
	new RequestedItem(13), 
	new RequestedItem(14), 
	new RequestedItem(15), 
	new RequestedItem(16)
    };
    public static final RequestedItem reserved = cNamedNumbers[0];
    public static final RequestedItem itemA = cNamedNumbers[1];
    public static final RequestedItem itemB = cNamedNumbers[2];
    public static final RequestedItem itemC = cNamedNumbers[3];
    public static final RequestedItem itemD = cNamedNumbers[4];
    public static final RequestedItem itemE = cNamedNumbers[5];
    public static final RequestedItem itemF = cNamedNumbers[6];
    public static final RequestedItem itemG = cNamedNumbers[7];
    public static final RequestedItem itemI = cNamedNumbers[8];
    public static final RequestedItem itemJ = cNamedNumbers[9];
    public static final RequestedItem itemK = cNamedNumbers[10];
    public static final RequestedItem itemL = cNamedNumbers[11];
    public static final RequestedItem itemM = cNamedNumbers[12];
    public static final RequestedItem itemN = cNamedNumbers[13];
    public static final RequestedItem itemO = cNamedNumbers[14];
    public static final RequestedItem itemP = cNamedNumbers[15];
    public static final RequestedItem itemQ = cNamedNumbers[16];
    
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
	if (value >= 0 && value <= 16)
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
    
    public static RequestedItem valueOf(long value)
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
	if (isUnknownEnumerator())
	    return -1;
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
	    "RequestedItem"
	),
	new QName (
	    "DSRC",
	    "RequestedItem"
	),
	274454,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "reserved",
		    0
		),
		new MemberListElement (
		    "itemA",
		    1
		),
		new MemberListElement (
		    "itemB",
		    2
		),
		new MemberListElement (
		    "itemC",
		    3
		),
		new MemberListElement (
		    "itemD",
		    4
		),
		new MemberListElement (
		    "itemE",
		    5
		),
		new MemberListElement (
		    "itemF",
		    6
		),
		new MemberListElement (
		    "itemG",
		    7
		),
		new MemberListElement (
		    "itemI",
		    8
		),
		new MemberListElement (
		    "itemJ",
		    9
		),
		new MemberListElement (
		    "itemK",
		    10
		),
		new MemberListElement (
		    "itemL",
		    11
		),
		new MemberListElement (
		    "itemM",
		    12
		),
		new MemberListElement (
		    "itemN",
		    13
		),
		new MemberListElement (
		    "itemO",
		    14
		),
		new MemberListElement (
		    "itemP",
		    15
		),
		new MemberListElement (
		    "itemQ",
		    16
		)
	    }
	),
	0,
	reserved
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RequestedItem object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RequestedItem object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final RequestedItem cUnknownEnumerator = 
	new RequestedItem(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for RequestedItem
