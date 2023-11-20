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
 * Define the ASN1 Type LightbarInUse from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class LightbarInUse extends Enumerated {
    
    /**
     * The default constructor.
     */
    private LightbarInUse()
    {
	super(cFirstNumber);
    }
    
    protected LightbarInUse(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long notInUse = 1;
	public static final long inUse = 2;
	public static final long yellowCautionLights = 3;
	public static final long schooldBusLights = 4;
	public static final long arrowSignsActive = 5;
	public static final long slowMovingVehicle = 6;
	public static final long freqStops = 7;
    }
    // Named list definitions.
    private final static LightbarInUse cNamedNumbers[] = {
	new LightbarInUse(), 
	new LightbarInUse(1), 
	new LightbarInUse(2), 
	new LightbarInUse(3), 
	new LightbarInUse(4), 
	new LightbarInUse(5), 
	new LightbarInUse(6), 
	new LightbarInUse(7)
    };
    public static final LightbarInUse unavailable = cNamedNumbers[0];
    public static final LightbarInUse notInUse = cNamedNumbers[1];
    public static final LightbarInUse inUse = cNamedNumbers[2];
    public static final LightbarInUse yellowCautionLights = cNamedNumbers[3];
    public static final LightbarInUse schooldBusLights = cNamedNumbers[4];
    public static final LightbarInUse arrowSignsActive = cNamedNumbers[5];
    public static final LightbarInUse slowMovingVehicle = cNamedNumbers[6];
    public static final LightbarInUse freqStops = cNamedNumbers[7];
    
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
    
    public static LightbarInUse valueOf(long value)
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
	    "LightbarInUse"
	),
	new QName (
	    "DSRC",
	    "LightbarInUse"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "unavailable",
		    0
		),
		new MemberListElement (
		    "notInUse",
		    1
		),
		new MemberListElement (
		    "inUse",
		    2
		),
		new MemberListElement (
		    "yellowCautionLights",
		    3
		),
		new MemberListElement (
		    "schooldBusLights",
		    4
		),
		new MemberListElement (
		    "arrowSignsActive",
		    5
		),
		new MemberListElement (
		    "slowMovingVehicle",
		    6
		),
		new MemberListElement (
		    "freqStops",
		    7
		)
	    }
	),
	0,
	unavailable
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LightbarInUse object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LightbarInUse object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LightbarInUse
