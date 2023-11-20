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
 * Define the ASN1 Type DispLocation from ASN1 Module AddGrpD.
 * @see Enumerated
 */

public final class DispLocation extends Enumerated {
    
    /**
     * The default constructor.
     */
    private DispLocation()
    {
	super(cFirstNumber);
    }
    
    protected DispLocation(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long pass = 0;
	public static final long entry = 1;
	public static final long before_entry = 2;
	public static final long timIn = 10;
	public static final long timOut = 11;
	public static final long ttcZone0 = 20;
	public static final long ttcZone1 = 21;
	public static final long ttcZone2 = 22;
	public static final long ttcZone3 = 23;
	public static final long before_zone = 24;
	public static final long alert = 30;
	public static final long approach = 31;
	public static final long approach1 = 32;
	public static final long before_approach = 33;
	public static final long others = 99;
    }
    // Named list definitions.
    private final static DispLocation cNamedNumbers[] = {
	new DispLocation(), 
	new DispLocation(1), 
	new DispLocation(2), 
	new DispLocation(10), 
	new DispLocation(11), 
	new DispLocation(20), 
	new DispLocation(21), 
	new DispLocation(22), 
	new DispLocation(23), 
	new DispLocation(24), 
	new DispLocation(30), 
	new DispLocation(31), 
	new DispLocation(32), 
	new DispLocation(33), 
	new DispLocation(99)
    };
    public static final DispLocation pass = cNamedNumbers[0];
    public static final DispLocation entry = cNamedNumbers[1];
    public static final DispLocation before_entry = cNamedNumbers[2];
    public static final DispLocation timIn = cNamedNumbers[3];
    public static final DispLocation timOut = cNamedNumbers[4];
    public static final DispLocation ttcZone0 = cNamedNumbers[5];
    public static final DispLocation ttcZone1 = cNamedNumbers[6];
    public static final DispLocation ttcZone2 = cNamedNumbers[7];
    public static final DispLocation ttcZone3 = cNamedNumbers[8];
    public static final DispLocation before_zone = cNamedNumbers[9];
    public static final DispLocation alert = cNamedNumbers[10];
    public static final DispLocation approach = cNamedNumbers[11];
    public static final DispLocation approach1 = cNamedNumbers[12];
    public static final DispLocation before_approach = cNamedNumbers[13];
    public static final DispLocation others = cNamedNumbers[14];
    
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
	return indexOfValue(value, cNamedNumbers, 0, 15);
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static DispLocation valueOf(long value)
    {
	int inx = indexOfValue(value, cNamedNumbers, 0, 15);
	
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
	return indexOfValue(mValue, cNamedNumbers, 0, 15);
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
	    "DispLocation"
	),
	new QName (
	    "AddGrpD",
	    "DispLocation"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "pass",
		    0
		),
		new MemberListElement (
		    "entry",
		    1
		),
		new MemberListElement (
		    "before_entry",
		    2
		),
		new MemberListElement (
		    "timIn",
		    10
		),
		new MemberListElement (
		    "timOut",
		    11
		),
		new MemberListElement (
		    "ttcZone0",
		    20
		),
		new MemberListElement (
		    "ttcZone1",
		    21
		),
		new MemberListElement (
		    "ttcZone2",
		    22
		),
		new MemberListElement (
		    "ttcZone3",
		    23
		),
		new MemberListElement (
		    "before_zone",
		    24
		),
		new MemberListElement (
		    "alert",
		    30
		),
		new MemberListElement (
		    "approach",
		    31
		),
		new MemberListElement (
		    "approach1",
		    32
		),
		new MemberListElement (
		    "before_approach",
		    33
		),
		new MemberListElement (
		    "others",
		    99
		)
	    }
	),
	0,
	pass
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DispLocation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DispLocation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DispLocation
