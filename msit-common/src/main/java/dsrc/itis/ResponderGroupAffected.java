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


package dsrc.itis;

import com.oss.asn1.Enumerated;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ResponderGroupAffected from ASN1 Module ITIS.
 * @see Enumerated
 */

public final class ResponderGroupAffected extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ResponderGroupAffected()
    {
	super(cFirstNumber);
    }
    
    protected ResponderGroupAffected(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long emergency_vehicle_units = 9729;
	public static final long federal_law_enforcement_units = 9730;
	public static final long state_police_units = 9731;
	public static final long county_police_units = 9732;
	public static final long local_police_units = 9733;
	public static final long ambulance_units = 9734;
	public static final long rescue_units = 9735;
	public static final long fire_units = 9736;
	public static final long hAZMAT_units = 9737;
	public static final long light_tow_unit = 9738;
	public static final long heavy_tow_unit = 9739;
	public static final long freeway_service_patrols = 9740;
	public static final long transportation_response_units = 9741;
	public static final long private_contractor_response_units = 9742;
	public static final long private_tow_units = 9743;
	
    }
    // Named list definitions.
    private final static ResponderGroupAffected cNamedNumbers[] = {
	new ResponderGroupAffected(), 
	new ResponderGroupAffected(9730), 
	new ResponderGroupAffected(9731), 
	new ResponderGroupAffected(9732), 
	new ResponderGroupAffected(9733), 
	new ResponderGroupAffected(9734), 
	new ResponderGroupAffected(9735), 
	new ResponderGroupAffected(9736), 
	new ResponderGroupAffected(9737), 
	new ResponderGroupAffected(9738), 
	new ResponderGroupAffected(9739), 
	new ResponderGroupAffected(9740), 
	new ResponderGroupAffected(9741), 
	new ResponderGroupAffected(9742), 
	new ResponderGroupAffected(9743)
    };
    public static final ResponderGroupAffected emergency_vehicle_units = cNamedNumbers[0];
    public static final ResponderGroupAffected federal_law_enforcement_units = cNamedNumbers[1];
    public static final ResponderGroupAffected state_police_units = cNamedNumbers[2];
    public static final ResponderGroupAffected county_police_units = cNamedNumbers[3];
    public static final ResponderGroupAffected local_police_units = cNamedNumbers[4];
    public static final ResponderGroupAffected ambulance_units = cNamedNumbers[5];
    public static final ResponderGroupAffected rescue_units = cNamedNumbers[6];
    public static final ResponderGroupAffected fire_units = cNamedNumbers[7];
    public static final ResponderGroupAffected hAZMAT_units = cNamedNumbers[8];
    public static final ResponderGroupAffected light_tow_unit = cNamedNumbers[9];
    public static final ResponderGroupAffected heavy_tow_unit = cNamedNumbers[10];
    public static final ResponderGroupAffected freeway_service_patrols = cNamedNumbers[11];
    public static final ResponderGroupAffected transportation_response_units = cNamedNumbers[12];
    public static final ResponderGroupAffected private_contractor_response_units = cNamedNumbers[13];
    public static final ResponderGroupAffected private_tow_units = cNamedNumbers[14];
    
    protected final static long cFirstNumber = 9729;
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
	if (value >= 9729 && value <= 9743)
	    return (int)(value - 9729);
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static ResponderGroupAffected valueOf(long value)
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
	    "dsrc.itis",
	    "ResponderGroupAffected"
	),
	new QName (
	    "ITIS",
	    "ResponderGroupAffected"
	),
	274454,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "emergency-vehicle-units",
		    9729
		),
		new MemberListElement (
		    "federal-law-enforcement-units",
		    9730
		),
		new MemberListElement (
		    "state-police-units",
		    9731
		),
		new MemberListElement (
		    "county-police-units",
		    9732
		),
		new MemberListElement (
		    "local-police-units",
		    9733
		),
		new MemberListElement (
		    "ambulance-units",
		    9734
		),
		new MemberListElement (
		    "rescue-units",
		    9735
		),
		new MemberListElement (
		    "fire-units",
		    9736
		),
		new MemberListElement (
		    "hAZMAT-units",
		    9737
		),
		new MemberListElement (
		    "light-tow-unit",
		    9738
		),
		new MemberListElement (
		    "heavy-tow-unit",
		    9739
		),
		new MemberListElement (
		    "freeway-service-patrols",
		    9740
		),
		new MemberListElement (
		    "transportation-response-units",
		    9741
		),
		new MemberListElement (
		    "private-contractor-response-units",
		    9742
		),
		new MemberListElement (
		    "private-tow-units",
		    9743
		)
	    }
	),
	0,
	emergency_vehicle_units
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ResponderGroupAffected object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ResponderGroupAffected object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final ResponderGroupAffected cUnknownEnumerator = 
	new ResponderGroupAffected(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for ResponderGroupAffected
