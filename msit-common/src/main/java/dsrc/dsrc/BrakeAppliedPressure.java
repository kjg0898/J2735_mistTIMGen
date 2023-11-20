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
 * Define the ASN1 Type BrakeAppliedPressure from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class BrakeAppliedPressure extends Enumerated {
    
    /**
     * The default constructor.
     */
    private BrakeAppliedPressure()
    {
	super(cFirstNumber);
    }
    
    protected BrakeAppliedPressure(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long minPressure = 1;
	public static final long bkLvl_2 = 2;
	public static final long bkLvl_3 = 3;
	public static final long bkLvl_4 = 4;
	public static final long bkLvl_5 = 5;
	public static final long bkLvl_6 = 6;
	public static final long bkLvl_7 = 7;
	public static final long bkLvl_8 = 8;
	public static final long bkLvl_9 = 9;
	public static final long bkLvl_10 = 10;
	public static final long bkLvl_11 = 11;
	public static final long bkLvl_12 = 12;
	public static final long bkLvl_13 = 13;
	public static final long bkLvl_14 = 14;
	public static final long maxPressure = 15;
    }
    // Named list definitions.
    private final static BrakeAppliedPressure cNamedNumbers[] = {
	new BrakeAppliedPressure(), 
	new BrakeAppliedPressure(1), 
	new BrakeAppliedPressure(2), 
	new BrakeAppliedPressure(3), 
	new BrakeAppliedPressure(4), 
	new BrakeAppliedPressure(5), 
	new BrakeAppliedPressure(6), 
	new BrakeAppliedPressure(7), 
	new BrakeAppliedPressure(8), 
	new BrakeAppliedPressure(9), 
	new BrakeAppliedPressure(10), 
	new BrakeAppliedPressure(11), 
	new BrakeAppliedPressure(12), 
	new BrakeAppliedPressure(13), 
	new BrakeAppliedPressure(14), 
	new BrakeAppliedPressure(15)
    };
    public static final BrakeAppliedPressure unavailable = cNamedNumbers[0];
    public static final BrakeAppliedPressure minPressure = cNamedNumbers[1];
    public static final BrakeAppliedPressure bkLvl_2 = cNamedNumbers[2];
    public static final BrakeAppliedPressure bkLvl_3 = cNamedNumbers[3];
    public static final BrakeAppliedPressure bkLvl_4 = cNamedNumbers[4];
    public static final BrakeAppliedPressure bkLvl_5 = cNamedNumbers[5];
    public static final BrakeAppliedPressure bkLvl_6 = cNamedNumbers[6];
    public static final BrakeAppliedPressure bkLvl_7 = cNamedNumbers[7];
    public static final BrakeAppliedPressure bkLvl_8 = cNamedNumbers[8];
    public static final BrakeAppliedPressure bkLvl_9 = cNamedNumbers[9];
    public static final BrakeAppliedPressure bkLvl_10 = cNamedNumbers[10];
    public static final BrakeAppliedPressure bkLvl_11 = cNamedNumbers[11];
    public static final BrakeAppliedPressure bkLvl_12 = cNamedNumbers[12];
    public static final BrakeAppliedPressure bkLvl_13 = cNamedNumbers[13];
    public static final BrakeAppliedPressure bkLvl_14 = cNamedNumbers[14];
    public static final BrakeAppliedPressure maxPressure = cNamedNumbers[15];
    
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
    
    public static BrakeAppliedPressure valueOf(long value)
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
	    "BrakeAppliedPressure"
	),
	new QName (
	    "DSRC",
	    "BrakeAppliedPressure"
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
		    "minPressure",
		    1
		),
		new MemberListElement (
		    "bkLvl-2",
		    2
		),
		new MemberListElement (
		    "bkLvl-3",
		    3
		),
		new MemberListElement (
		    "bkLvl-4",
		    4
		),
		new MemberListElement (
		    "bkLvl-5",
		    5
		),
		new MemberListElement (
		    "bkLvl-6",
		    6
		),
		new MemberListElement (
		    "bkLvl-7",
		    7
		),
		new MemberListElement (
		    "bkLvl-8",
		    8
		),
		new MemberListElement (
		    "bkLvl-9",
		    9
		),
		new MemberListElement (
		    "bkLvl-10",
		    10
		),
		new MemberListElement (
		    "bkLvl-11",
		    11
		),
		new MemberListElement (
		    "bkLvl-12",
		    12
		),
		new MemberListElement (
		    "bkLvl-13",
		    13
		),
		new MemberListElement (
		    "bkLvl-14",
		    14
		),
		new MemberListElement (
		    "maxPressure",
		    15
		)
	    }
	),
	0,
	unavailable
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BrakeAppliedPressure object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BrakeAppliedPressure object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BrakeAppliedPressure
