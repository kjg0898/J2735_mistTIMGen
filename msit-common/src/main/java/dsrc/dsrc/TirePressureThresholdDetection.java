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
 * Define the ASN1 Type TirePressureThresholdDetection from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class TirePressureThresholdDetection extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TirePressureThresholdDetection()
    {
	super(cFirstNumber);
    }
    
    protected TirePressureThresholdDetection(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long noData = 0;
	public static final long overPressure = 1;
	public static final long noWarningPressure = 2;
	public static final long underPressure = 3;
	public static final long extremeUnderPressure = 4;
	public static final long undefined = 5;
	public static final long errorIndicator = 6;
	public static final long notAvailable = 7;
    }
    // Named list definitions.
    private final static TirePressureThresholdDetection cNamedNumbers[] = {
	new TirePressureThresholdDetection(), 
	new TirePressureThresholdDetection(1), 
	new TirePressureThresholdDetection(2), 
	new TirePressureThresholdDetection(3), 
	new TirePressureThresholdDetection(4), 
	new TirePressureThresholdDetection(5), 
	new TirePressureThresholdDetection(6), 
	new TirePressureThresholdDetection(7)
    };
    public static final TirePressureThresholdDetection noData = cNamedNumbers[0];
    public static final TirePressureThresholdDetection overPressure = cNamedNumbers[1];
    public static final TirePressureThresholdDetection noWarningPressure = cNamedNumbers[2];
    public static final TirePressureThresholdDetection underPressure = cNamedNumbers[3];
    public static final TirePressureThresholdDetection extremeUnderPressure = cNamedNumbers[4];
    public static final TirePressureThresholdDetection undefined = cNamedNumbers[5];
    public static final TirePressureThresholdDetection errorIndicator = cNamedNumbers[6];
    public static final TirePressureThresholdDetection notAvailable = cNamedNumbers[7];
    
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
    
    public static TirePressureThresholdDetection valueOf(long value)
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
	    "TirePressureThresholdDetection"
	),
	new QName (
	    "DSRC",
	    "TirePressureThresholdDetection"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "noData",
		    0
		),
		new MemberListElement (
		    "overPressure",
		    1
		),
		new MemberListElement (
		    "noWarningPressure",
		    2
		),
		new MemberListElement (
		    "underPressure",
		    3
		),
		new MemberListElement (
		    "extremeUnderPressure",
		    4
		),
		new MemberListElement (
		    "undefined",
		    5
		),
		new MemberListElement (
		    "errorIndicator",
		    6
		),
		new MemberListElement (
		    "notAvailable",
		    7
		)
	    }
	),
	0,
	noData
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TirePressureThresholdDetection object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TirePressureThresholdDetection object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TirePressureThresholdDetection
