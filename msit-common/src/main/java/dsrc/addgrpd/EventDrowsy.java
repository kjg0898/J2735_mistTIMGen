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
 * Define the ASN1 Type EventDrowsy from ASN1 Module AddGrpD.
 * @see Enumerated
 */

public final class EventDrowsy extends Enumerated {
    
    /**
     * The default constructor.
     */
    private EventDrowsy()
    {
	super(cFirstNumber);
    }
    
    protected EventDrowsy(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long frontEyeOff = 0;
	public static final long drowsyLight = 1;
	public static final long drowsySerious = 2;
	public static final long faceoff = 3;
	public static final long smoking = 4;
	public static final long phone = 5;
	public static final long yawn = 6;
    }
    // Named list definitions.
    private final static EventDrowsy cNamedNumbers[] = {
	new EventDrowsy(), 
	new EventDrowsy(1), 
	new EventDrowsy(2), 
	new EventDrowsy(3), 
	new EventDrowsy(4), 
	new EventDrowsy(5), 
	new EventDrowsy(6)
    };
    public static final EventDrowsy frontEyeOff = cNamedNumbers[0];
    public static final EventDrowsy drowsyLight = cNamedNumbers[1];
    public static final EventDrowsy drowsySerious = cNamedNumbers[2];
    public static final EventDrowsy faceoff = cNamedNumbers[3];
    public static final EventDrowsy smoking = cNamedNumbers[4];
    public static final EventDrowsy phone = cNamedNumbers[5];
    public static final EventDrowsy yawn = cNamedNumbers[6];
    
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
    
    public static EventDrowsy valueOf(long value)
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
	    "EventDrowsy"
	),
	new QName (
	    "AddGrpD",
	    "EventDrowsy"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "frontEyeOff",
		    0
		),
		new MemberListElement (
		    "drowsyLight",
		    1
		),
		new MemberListElement (
		    "drowsySerious",
		    2
		),
		new MemberListElement (
		    "faceoff",
		    3
		),
		new MemberListElement (
		    "smoking",
		    4
		),
		new MemberListElement (
		    "phone",
		    5
		),
		new MemberListElement (
		    "yawn",
		    6
		)
	    }
	),
	0,
	frontEyeOff
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EventDrowsy object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EventDrowsy object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EventDrowsy
