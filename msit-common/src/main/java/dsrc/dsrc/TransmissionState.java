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
 * Define the ASN1 Type TransmissionState from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class TransmissionState extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TransmissionState()
    {
	super(cFirstNumber);
    }
    
    protected TransmissionState(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long neutral = 0;
	public static final long park = 1;
	public static final long forwardGears = 2;
	public static final long reverseGears = 3;
	public static final long reserved1 = 4;
	public static final long reserved2 = 5;
	public static final long reserved3 = 6;
	public static final long unavailable = 7;
    }
    // Named list definitions.
    private final static TransmissionState cNamedNumbers[] = {
	new TransmissionState(), 
	new TransmissionState(1), 
	new TransmissionState(2), 
	new TransmissionState(3), 
	new TransmissionState(4), 
	new TransmissionState(5), 
	new TransmissionState(6), 
	new TransmissionState(7)
    };
    public static final TransmissionState neutral = cNamedNumbers[0];
    public static final TransmissionState park = cNamedNumbers[1];
    public static final TransmissionState forwardGears = cNamedNumbers[2];
    public static final TransmissionState reverseGears = cNamedNumbers[3];
    public static final TransmissionState reserved1 = cNamedNumbers[4];
    public static final TransmissionState reserved2 = cNamedNumbers[5];
    public static final TransmissionState reserved3 = cNamedNumbers[6];
    public static final TransmissionState unavailable = cNamedNumbers[7];
    
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
	if (value >= 0 && value <= 7)
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
    
    public static TransmissionState valueOf(long value)
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
	    "TransmissionState"
	),
	new QName (
	    "DSRC",
	    "TransmissionState"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "neutral",
		    0
		),
		new MemberListElement (
		    "park",
		    1
		),
		new MemberListElement (
		    "forwardGears",
		    2
		),
		new MemberListElement (
		    "reverseGears",
		    3
		),
		new MemberListElement (
		    "reserved1",
		    4
		),
		new MemberListElement (
		    "reserved2",
		    5
		),
		new MemberListElement (
		    "reserved3",
		    6
		),
		new MemberListElement (
		    "unavailable",
		    7
		)
	    }
	),
	0,
	neutral
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TransmissionState object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransmissionState object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransmissionState
