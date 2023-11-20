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
 * Define the ASN1 Type LayerType from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class LayerType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private LayerType()
    {
	super(cFirstNumber);
    }
    
    protected LayerType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long none = 0;
	public static final long mixedContent = 1;
	public static final long generalMapData = 2;
	public static final long intersectionData = 3;
	public static final long curveData = 4;
	public static final long roadwaySectionData = 5;
	public static final long parkingAreaData = 6;
	public static final long sharedLaneData = 7;
	
    }
    // Named list definitions.
    private final static LayerType cNamedNumbers[] = {
	new LayerType(), 
	new LayerType(1), 
	new LayerType(2), 
	new LayerType(3), 
	new LayerType(4), 
	new LayerType(5), 
	new LayerType(6), 
	new LayerType(7)
    };
    public static final LayerType none = cNamedNumbers[0];
    public static final LayerType mixedContent = cNamedNumbers[1];
    public static final LayerType generalMapData = cNamedNumbers[2];
    public static final LayerType intersectionData = cNamedNumbers[3];
    public static final LayerType curveData = cNamedNumbers[4];
    public static final LayerType roadwaySectionData = cNamedNumbers[5];
    public static final LayerType parkingAreaData = cNamedNumbers[6];
    public static final LayerType sharedLaneData = cNamedNumbers[7];
    
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
    
    public static LayerType valueOf(long value)
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
	    "LayerType"
	),
	new QName (
	    "DSRC",
	    "LayerType"
	),
	274454,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "none",
		    0
		),
		new MemberListElement (
		    "mixedContent",
		    1
		),
		new MemberListElement (
		    "generalMapData",
		    2
		),
		new MemberListElement (
		    "intersectionData",
		    3
		),
		new MemberListElement (
		    "curveData",
		    4
		),
		new MemberListElement (
		    "roadwaySectionData",
		    5
		),
		new MemberListElement (
		    "parkingAreaData",
		    6
		),
		new MemberListElement (
		    "sharedLaneData",
		    7
		)
	    }
	),
	0,
	none
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LayerType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LayerType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final LayerType cUnknownEnumerator = 
	new LayerType(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for LayerType
