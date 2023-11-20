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
 * Define the ASN1 Type PrioritizationResponseStatus from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class PrioritizationResponseStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PrioritizationResponseStatus()
    {
	super(cFirstNumber);
    }
    
    protected PrioritizationResponseStatus(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unknown = 0;
	public static final long requested = 1;
	public static final long processing = 2;
	public static final long watchOtherTraffic = 3;
	public static final long granted = 4;
	public static final long rejected = 5;
	public static final long maxPresence = 6;
	public static final long reserviceLocked = 7;
	
    }
    // Named list definitions.
    private final static PrioritizationResponseStatus cNamedNumbers[] = {
	new PrioritizationResponseStatus(), 
	new PrioritizationResponseStatus(1), 
	new PrioritizationResponseStatus(2), 
	new PrioritizationResponseStatus(3), 
	new PrioritizationResponseStatus(4), 
	new PrioritizationResponseStatus(5), 
	new PrioritizationResponseStatus(6), 
	new PrioritizationResponseStatus(7)
    };
    public static final PrioritizationResponseStatus unknown = cNamedNumbers[0];
    public static final PrioritizationResponseStatus requested = cNamedNumbers[1];
    public static final PrioritizationResponseStatus processing = cNamedNumbers[2];
    public static final PrioritizationResponseStatus watchOtherTraffic = cNamedNumbers[3];
    public static final PrioritizationResponseStatus granted = cNamedNumbers[4];
    public static final PrioritizationResponseStatus rejected = cNamedNumbers[5];
    public static final PrioritizationResponseStatus maxPresence = cNamedNumbers[6];
    public static final PrioritizationResponseStatus reserviceLocked = cNamedNumbers[7];
    
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
    
    public static PrioritizationResponseStatus valueOf(long value)
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
	    "PrioritizationResponseStatus"
	),
	new QName (
	    "DSRC",
	    "PrioritizationResponseStatus"
	),
	274454,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "unknown",
		    0
		),
		new MemberListElement (
		    "requested",
		    1
		),
		new MemberListElement (
		    "processing",
		    2
		),
		new MemberListElement (
		    "watchOtherTraffic",
		    3
		),
		new MemberListElement (
		    "granted",
		    4
		),
		new MemberListElement (
		    "rejected",
		    5
		),
		new MemberListElement (
		    "maxPresence",
		    6
		),
		new MemberListElement (
		    "reserviceLocked",
		    7
		)
	    }
	),
	0,
	unknown
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PrioritizationResponseStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PrioritizationResponseStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final PrioritizationResponseStatus cUnknownEnumerator = 
	new PrioritizationResponseStatus(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for PrioritizationResponseStatus
