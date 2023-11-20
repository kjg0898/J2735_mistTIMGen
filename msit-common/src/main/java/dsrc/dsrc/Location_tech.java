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
 * Define the ASN1 Type Location_tech from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class Location_tech extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Location_tech()
    {
	super(cFirstNumber);
    }
    
    protected Location_tech(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long loc_tech_unknown = 0;
	public static final long loc_tech_GNSS = 1;
	public static final long loc_tech_DGPS = 2;
	public static final long loc_tech_RTK = 3;
	public static final long loc_tech_PPP = 4;
	public static final long loc_tech_drGPS = 5;
	public static final long loc_tech_drDGPS = 6;
	public static final long loc_tech_dr = 7;
	public static final long loc_tech_nav = 8;
	public static final long loc_tech_fault = 9;
	
    }
    // Named list definitions.
    private final static Location_tech cNamedNumbers[] = {
	new Location_tech(), 
	new Location_tech(1), 
	new Location_tech(2), 
	new Location_tech(3), 
	new Location_tech(4), 
	new Location_tech(5), 
	new Location_tech(6), 
	new Location_tech(7), 
	new Location_tech(8), 
	new Location_tech(9)
    };
    public static final Location_tech loc_tech_unknown = cNamedNumbers[0];
    public static final Location_tech loc_tech_GNSS = cNamedNumbers[1];
    public static final Location_tech loc_tech_DGPS = cNamedNumbers[2];
    public static final Location_tech loc_tech_RTK = cNamedNumbers[3];
    public static final Location_tech loc_tech_PPP = cNamedNumbers[4];
    public static final Location_tech loc_tech_drGPS = cNamedNumbers[5];
    public static final Location_tech loc_tech_drDGPS = cNamedNumbers[6];
    public static final Location_tech loc_tech_dr = cNamedNumbers[7];
    public static final Location_tech loc_tech_nav = cNamedNumbers[8];
    public static final Location_tech loc_tech_fault = cNamedNumbers[9];
    
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
	if (value >= 0 && value <= 9)
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
    
    public static Location_tech valueOf(long value)
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
	    "Location_tech"
	),
	new QName (
	    "DSRC",
	    "Location-tech"
	),
	274454,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "loc-tech-unknown",
		    0
		),
		new MemberListElement (
		    "loc-tech-GNSS",
		    1
		),
		new MemberListElement (
		    "loc-tech-DGPS",
		    2
		),
		new MemberListElement (
		    "loc-tech-RTK",
		    3
		),
		new MemberListElement (
		    "loc-tech-PPP",
		    4
		),
		new MemberListElement (
		    "loc-tech-drGPS",
		    5
		),
		new MemberListElement (
		    "loc-tech-drDGPS",
		    6
		),
		new MemberListElement (
		    "loc-tech-dr",
		    7
		),
		new MemberListElement (
		    "loc-tech-nav",
		    8
		),
		new MemberListElement (
		    "loc-tech-fault",
		    9
		)
	    }
	),
	0,
	loc_tech_unknown
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Location_tech object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Location_tech object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final Location_tech cUnknownEnumerator = 
	new Location_tech(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for Location_tech
