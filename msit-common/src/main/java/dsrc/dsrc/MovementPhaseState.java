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
 * Define the ASN1 Type MovementPhaseState from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class MovementPhaseState extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MovementPhaseState()
    {
	super(cFirstNumber);
    }
    
    protected MovementPhaseState(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long dark = 1;
	public static final long stop_Then_Proceed = 2;
	public static final long stop_And_Remain = 3;
	public static final long pre_Movement = 4;
	public static final long permissive_Movement_Allowed = 5;
	public static final long protected_Movement_Allowed = 6;
	public static final long permissive_clearance = 7;
	public static final long protected_clearance = 8;
	public static final long caution_Conflicting_Traffic = 9;
    }
    // Named list definitions.
    private final static MovementPhaseState cNamedNumbers[] = {
	new MovementPhaseState(), 
	new MovementPhaseState(1), 
	new MovementPhaseState(2), 
	new MovementPhaseState(3), 
	new MovementPhaseState(4), 
	new MovementPhaseState(5), 
	new MovementPhaseState(6), 
	new MovementPhaseState(7), 
	new MovementPhaseState(8), 
	new MovementPhaseState(9)
    };
    public static final MovementPhaseState unavailable = cNamedNumbers[0];
    public static final MovementPhaseState dark = cNamedNumbers[1];
    public static final MovementPhaseState stop_Then_Proceed = cNamedNumbers[2];
    public static final MovementPhaseState stop_And_Remain = cNamedNumbers[3];
    public static final MovementPhaseState pre_Movement = cNamedNumbers[4];
    public static final MovementPhaseState permissive_Movement_Allowed = cNamedNumbers[5];
    public static final MovementPhaseState protected_Movement_Allowed = cNamedNumbers[6];
    public static final MovementPhaseState permissive_clearance = cNamedNumbers[7];
    public static final MovementPhaseState protected_clearance = cNamedNumbers[8];
    public static final MovementPhaseState caution_Conflicting_Traffic = cNamedNumbers[9];
    
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
    
    public static MovementPhaseState valueOf(long value)
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
	    "MovementPhaseState"
	),
	new QName (
	    "DSRC",
	    "MovementPhaseState"
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
		    "dark",
		    1
		),
		new MemberListElement (
		    "stop-Then-Proceed",
		    2
		),
		new MemberListElement (
		    "stop-And-Remain",
		    3
		),
		new MemberListElement (
		    "pre-Movement",
		    4
		),
		new MemberListElement (
		    "permissive-Movement-Allowed",
		    5
		),
		new MemberListElement (
		    "protected-Movement-Allowed",
		    6
		),
		new MemberListElement (
		    "permissive-clearance",
		    7
		),
		new MemberListElement (
		    "protected-clearance",
		    8
		),
		new MemberListElement (
		    "caution-Conflicting-Traffic",
		    9
		)
	    }
	),
	0,
	unavailable
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MovementPhaseState object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MovementPhaseState object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MovementPhaseState
