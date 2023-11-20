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


package dsrc.addgrpd;

import com.oss.asn1.Enumerated;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ADASFCWSEventType from ASN1 Module AddGrpD.
 * @see Enumerated
 */

public final class ADASFCWSEventType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ADASFCWSEventType()
    {
	super(cFirstNumber);
    }
    
    protected ADASFCWSEventType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long nowarning = 0;
	public static final long bus = 1;
	public static final long car = 2;
	public static final long truck = 3;
	public static final long motors = 4;
	public static final long special = 5;
	public static final long bicycle = 6;
    }
    // Named list definitions.
    private final static ADASFCWSEventType cNamedNumbers[] = {
	new ADASFCWSEventType(), 
	new ADASFCWSEventType(1), 
	new ADASFCWSEventType(2), 
	new ADASFCWSEventType(3), 
	new ADASFCWSEventType(4), 
	new ADASFCWSEventType(5), 
	new ADASFCWSEventType(6)
    };
    public static final ADASFCWSEventType nowarning = cNamedNumbers[0];
    public static final ADASFCWSEventType bus = cNamedNumbers[1];
    public static final ADASFCWSEventType car = cNamedNumbers[2];
    public static final ADASFCWSEventType truck = cNamedNumbers[3];
    public static final ADASFCWSEventType motors = cNamedNumbers[4];
    public static final ADASFCWSEventType special = cNamedNumbers[5];
    public static final ADASFCWSEventType bicycle = cNamedNumbers[6];
    
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
	if (value >= 0 && value <= 6)
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
    
    public static ADASFCWSEventType valueOf(long value)
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
	    "dsrc.addgrpd",
	    "ADASFCWSEventType"
	),
	new QName (
	    "AddGrpD",
	    "ADASFCWSEventType"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "nowarning",
		    0
		),
		new MemberListElement (
		    "bus",
		    1
		),
		new MemberListElement (
		    "car",
		    2
		),
		new MemberListElement (
		    "truck",
		    3
		),
		new MemberListElement (
		    "motors",
		    4
		),
		new MemberListElement (
		    "special",
		    5
		),
		new MemberListElement (
		    "bicycle",
		    6
		)
	    }
	),
	0,
	nowarning
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ADASFCWSEventType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ADASFCWSEventType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ADASFCWSEventType
