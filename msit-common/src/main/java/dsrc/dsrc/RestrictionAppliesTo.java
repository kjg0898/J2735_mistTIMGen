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
 * Define the ASN1 Type RestrictionAppliesTo from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class RestrictionAppliesTo extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RestrictionAppliesTo()
    {
	super(cFirstNumber);
    }
    
    protected RestrictionAppliesTo(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long none = 0;
	public static final long equippedTransit = 1;
	public static final long equippedTaxis = 2;
	public static final long equippedOther = 3;
	public static final long emissionCompliant = 4;
	public static final long equippedBicycle = 5;
	public static final long weightCompliant = 6;
	public static final long heightCompliant = 7;
	public static final long pedestrians = 8;
	public static final long slowMovingPersons = 9;
	public static final long wheelchairUsers = 10;
	public static final long visualDisabilities = 11;
	public static final long audioDisabilities = 12;
	public static final long otherUnknownDisabilities = 13;
	
    }
    // Named list definitions.
    private final static RestrictionAppliesTo cNamedNumbers[] = {
	new RestrictionAppliesTo(), 
	new RestrictionAppliesTo(1), 
	new RestrictionAppliesTo(2), 
	new RestrictionAppliesTo(3), 
	new RestrictionAppliesTo(4), 
	new RestrictionAppliesTo(5), 
	new RestrictionAppliesTo(6), 
	new RestrictionAppliesTo(7), 
	new RestrictionAppliesTo(8), 
	new RestrictionAppliesTo(9), 
	new RestrictionAppliesTo(10), 
	new RestrictionAppliesTo(11), 
	new RestrictionAppliesTo(12), 
	new RestrictionAppliesTo(13)
    };
    public static final RestrictionAppliesTo none = cNamedNumbers[0];
    public static final RestrictionAppliesTo equippedTransit = cNamedNumbers[1];
    public static final RestrictionAppliesTo equippedTaxis = cNamedNumbers[2];
    public static final RestrictionAppliesTo equippedOther = cNamedNumbers[3];
    public static final RestrictionAppliesTo emissionCompliant = cNamedNumbers[4];
    public static final RestrictionAppliesTo equippedBicycle = cNamedNumbers[5];
    public static final RestrictionAppliesTo weightCompliant = cNamedNumbers[6];
    public static final RestrictionAppliesTo heightCompliant = cNamedNumbers[7];
    public static final RestrictionAppliesTo pedestrians = cNamedNumbers[8];
    public static final RestrictionAppliesTo slowMovingPersons = cNamedNumbers[9];
    public static final RestrictionAppliesTo wheelchairUsers = cNamedNumbers[10];
    public static final RestrictionAppliesTo visualDisabilities = cNamedNumbers[11];
    public static final RestrictionAppliesTo audioDisabilities = cNamedNumbers[12];
    public static final RestrictionAppliesTo otherUnknownDisabilities = cNamedNumbers[13];
    
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
	if (value >= 0 && value <= 13)
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
    
    public static RestrictionAppliesTo valueOf(long value)
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
	    "RestrictionAppliesTo"
	),
	new QName (
	    "DSRC",
	    "RestrictionAppliesTo"
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
		    "equippedTransit",
		    1
		),
		new MemberListElement (
		    "equippedTaxis",
		    2
		),
		new MemberListElement (
		    "equippedOther",
		    3
		),
		new MemberListElement (
		    "emissionCompliant",
		    4
		),
		new MemberListElement (
		    "equippedBicycle",
		    5
		),
		new MemberListElement (
		    "weightCompliant",
		    6
		),
		new MemberListElement (
		    "heightCompliant",
		    7
		),
		new MemberListElement (
		    "pedestrians",
		    8
		),
		new MemberListElement (
		    "slowMovingPersons",
		    9
		),
		new MemberListElement (
		    "wheelchairUsers",
		    10
		),
		new MemberListElement (
		    "visualDisabilities",
		    11
		),
		new MemberListElement (
		    "audioDisabilities",
		    12
		),
		new MemberListElement (
		    "otherUnknownDisabilities",
		    13
		)
	    }
	),
	0,
	none
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RestrictionAppliesTo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RestrictionAppliesTo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final RestrictionAppliesTo cUnknownEnumerator = 
	new RestrictionAppliesTo(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for RestrictionAppliesTo
