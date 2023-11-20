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
 * Define the ASN1 Type CITSTolgateType from ASN1 Module AddGrpD.
 * @see Enumerated
 */

public final class CITSTolgateType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private CITSTolgateType()
    {
	super(cFirstNumber);
    }
    
    protected CITSTolgateType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long general = 1;
	public static final long hipass = 2;
	public static final long truck_hipass = 3;
	public static final long multi_hipass_2 = 4;
	public static final long multi_hipass_3 = 5;
	public static final long multi_hipass_4 = 6;
	public static final long multi_hipass_5 = 7;
    }
    // Named list definitions.
    private final static CITSTolgateType cNamedNumbers[] = {
	new CITSTolgateType(), 
	new CITSTolgateType(2), 
	new CITSTolgateType(3), 
	new CITSTolgateType(4), 
	new CITSTolgateType(5), 
	new CITSTolgateType(6), 
	new CITSTolgateType(7)
    };
    public static final CITSTolgateType general = cNamedNumbers[0];
    public static final CITSTolgateType hipass = cNamedNumbers[1];
    public static final CITSTolgateType truck_hipass = cNamedNumbers[2];
    public static final CITSTolgateType multi_hipass_2 = cNamedNumbers[3];
    public static final CITSTolgateType multi_hipass_3 = cNamedNumbers[4];
    public static final CITSTolgateType multi_hipass_4 = cNamedNumbers[5];
    public static final CITSTolgateType multi_hipass_5 = cNamedNumbers[6];
    
    protected final static long cFirstNumber = 1;
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
	if (value >= 1 && value <= 7)
	    return (int)(value - 1);
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static CITSTolgateType valueOf(long value)
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
	    "CITSTolgateType"
	),
	new QName (
	    "AddGrpD",
	    "CITSTolgateType"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "general",
		    1
		),
		new MemberListElement (
		    "hipass",
		    2
		),
		new MemberListElement (
		    "truck-hipass",
		    3
		),
		new MemberListElement (
		    "multi-hipass-2",
		    4
		),
		new MemberListElement (
		    "multi-hipass-3",
		    5
		),
		new MemberListElement (
		    "multi-hipass-4",
		    6
		),
		new MemberListElement (
		    "multi-hipass-5",
		    7
		)
	    }
	),
	0,
	general
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CITSTolgateType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSTolgateType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSTolgateType
