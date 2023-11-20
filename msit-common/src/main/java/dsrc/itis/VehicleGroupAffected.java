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
 * Define the ASN1 Type VehicleGroupAffected from ASN1 Module ITIS.
 * @see Enumerated
 */

public final class VehicleGroupAffected extends Enumerated {
    
    /**
     * The default constructor.
     */
    private VehicleGroupAffected()
    {
	super(cFirstNumber);
    }
    
    protected VehicleGroupAffected(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long all_vehicles = 9217;
	public static final long bicycles = 9218;
	public static final long motorcycles = 9219;
	public static final long cars = 9220;
	public static final long light_vehicles = 9221;
	public static final long cars_and_light_vehicles = 9222;
	public static final long cars_with_trailers = 9223;
	public static final long cars_with_recreational_trailers = 9224;
	public static final long vehicles_with_trailers = 9225;
	public static final long heavy_vehicles = 9226;
	public static final long trucks = 9227;
	public static final long buses = 9228;
	public static final long articulated_buses = 9229;
	public static final long school_buses = 9230;
	public static final long vehicles_with_semi_trailers = 9231;
	public static final long vehicles_with_double_trailers = 9232;
	public static final long high_profile_vehicles = 9233;
	public static final long wide_vehicles = 9234;
	public static final long long_vehicles = 9235;
	public static final long hazardous_loads = 9236;
	public static final long exceptional_loads = 9237;
	public static final long abnormal_loads = 9238;
	public static final long convoys = 9239;
	public static final long maintenance_vehicles = 9240;
	public static final long delivery_vehicles = 9241;
	public static final long vehicles_with_even_numbered_license_plates = 9242;
	public static final long vehicles_with_odd_numbered_license_plates = 9243;
	public static final long vehicles_with_parking_permits = 9244;
	public static final long vehicles_with_catalytic_converters = 9245;
	public static final long vehicles_without_catalytic_converters = 9246;
	public static final long gas_powered_vehicles = 9247;
	public static final long diesel_powered_vehicles = 9248;
	public static final long lPG_vehicles = 9249;
	public static final long military_convoys = 9250;
	public static final long military_vehicles = 9251;
	public static final long electric_powered_vehicles = 9252;
	public static final long hybrid_powered_vehicles = 9253;
	public static final long inherently_low_emisson_vehicles = 9254;
	public static final long commerical_vehicles = 9255;
	public static final long runaway_vehicles = 9256;
	public static final long vehicles_with_lugs = 9257;
	public static final long motor_driven_cycles = 9258;
	public static final long recreational_vehicles = 9259;
	public static final long non_motorized_vehicles = 9260;
	public static final long traffic = 9261;
	
    }
    // Named list definitions.
    private final static VehicleGroupAffected cNamedNumbers[] = {
	new VehicleGroupAffected(), 
	new VehicleGroupAffected(9218), 
	new VehicleGroupAffected(9219), 
	new VehicleGroupAffected(9220), 
	new VehicleGroupAffected(9221), 
	new VehicleGroupAffected(9222), 
	new VehicleGroupAffected(9223), 
	new VehicleGroupAffected(9224), 
	new VehicleGroupAffected(9225), 
	new VehicleGroupAffected(9226), 
	new VehicleGroupAffected(9227), 
	new VehicleGroupAffected(9228), 
	new VehicleGroupAffected(9229), 
	new VehicleGroupAffected(9230), 
	new VehicleGroupAffected(9231), 
	new VehicleGroupAffected(9232), 
	new VehicleGroupAffected(9233), 
	new VehicleGroupAffected(9234), 
	new VehicleGroupAffected(9235), 
	new VehicleGroupAffected(9236), 
	new VehicleGroupAffected(9237), 
	new VehicleGroupAffected(9238), 
	new VehicleGroupAffected(9239), 
	new VehicleGroupAffected(9240), 
	new VehicleGroupAffected(9241), 
	new VehicleGroupAffected(9242), 
	new VehicleGroupAffected(9243), 
	new VehicleGroupAffected(9244), 
	new VehicleGroupAffected(9245), 
	new VehicleGroupAffected(9246), 
	new VehicleGroupAffected(9247), 
	new VehicleGroupAffected(9248), 
	new VehicleGroupAffected(9249), 
	new VehicleGroupAffected(9250), 
	new VehicleGroupAffected(9251), 
	new VehicleGroupAffected(9252), 
	new VehicleGroupAffected(9253), 
	new VehicleGroupAffected(9254), 
	new VehicleGroupAffected(9255), 
	new VehicleGroupAffected(9256), 
	new VehicleGroupAffected(9257), 
	new VehicleGroupAffected(9258), 
	new VehicleGroupAffected(9259), 
	new VehicleGroupAffected(9260), 
	new VehicleGroupAffected(9261)
    };
    public static final VehicleGroupAffected all_vehicles = cNamedNumbers[0];
    public static final VehicleGroupAffected bicycles = cNamedNumbers[1];
    public static final VehicleGroupAffected motorcycles = cNamedNumbers[2];
    public static final VehicleGroupAffected cars = cNamedNumbers[3];
    public static final VehicleGroupAffected light_vehicles = cNamedNumbers[4];
    public static final VehicleGroupAffected cars_and_light_vehicles = cNamedNumbers[5];
    public static final VehicleGroupAffected cars_with_trailers = cNamedNumbers[6];
    public static final VehicleGroupAffected cars_with_recreational_trailers = cNamedNumbers[7];
    public static final VehicleGroupAffected vehicles_with_trailers = cNamedNumbers[8];
    public static final VehicleGroupAffected heavy_vehicles = cNamedNumbers[9];
    public static final VehicleGroupAffected trucks = cNamedNumbers[10];
    public static final VehicleGroupAffected buses = cNamedNumbers[11];
    public static final VehicleGroupAffected articulated_buses = cNamedNumbers[12];
    public static final VehicleGroupAffected school_buses = cNamedNumbers[13];
    public static final VehicleGroupAffected vehicles_with_semi_trailers = cNamedNumbers[14];
    public static final VehicleGroupAffected vehicles_with_double_trailers = cNamedNumbers[15];
    public static final VehicleGroupAffected high_profile_vehicles = cNamedNumbers[16];
    public static final VehicleGroupAffected wide_vehicles = cNamedNumbers[17];
    public static final VehicleGroupAffected long_vehicles = cNamedNumbers[18];
    public static final VehicleGroupAffected hazardous_loads = cNamedNumbers[19];
    public static final VehicleGroupAffected exceptional_loads = cNamedNumbers[20];
    public static final VehicleGroupAffected abnormal_loads = cNamedNumbers[21];
    public static final VehicleGroupAffected convoys = cNamedNumbers[22];
    public static final VehicleGroupAffected maintenance_vehicles = cNamedNumbers[23];
    public static final VehicleGroupAffected delivery_vehicles = cNamedNumbers[24];
    public static final VehicleGroupAffected vehicles_with_even_numbered_license_plates = cNamedNumbers[25];
    public static final VehicleGroupAffected vehicles_with_odd_numbered_license_plates = cNamedNumbers[26];
    public static final VehicleGroupAffected vehicles_with_parking_permits = cNamedNumbers[27];
    public static final VehicleGroupAffected vehicles_with_catalytic_converters = cNamedNumbers[28];
    public static final VehicleGroupAffected vehicles_without_catalytic_converters = cNamedNumbers[29];
    public static final VehicleGroupAffected gas_powered_vehicles = cNamedNumbers[30];
    public static final VehicleGroupAffected diesel_powered_vehicles = cNamedNumbers[31];
    public static final VehicleGroupAffected lPG_vehicles = cNamedNumbers[32];
    public static final VehicleGroupAffected military_convoys = cNamedNumbers[33];
    public static final VehicleGroupAffected military_vehicles = cNamedNumbers[34];
    public static final VehicleGroupAffected electric_powered_vehicles = cNamedNumbers[35];
    public static final VehicleGroupAffected hybrid_powered_vehicles = cNamedNumbers[36];
    public static final VehicleGroupAffected inherently_low_emisson_vehicles = cNamedNumbers[37];
    public static final VehicleGroupAffected commerical_vehicles = cNamedNumbers[38];
    public static final VehicleGroupAffected runaway_vehicles = cNamedNumbers[39];
    public static final VehicleGroupAffected vehicles_with_lugs = cNamedNumbers[40];
    public static final VehicleGroupAffected motor_driven_cycles = cNamedNumbers[41];
    public static final VehicleGroupAffected recreational_vehicles = cNamedNumbers[42];
    public static final VehicleGroupAffected non_motorized_vehicles = cNamedNumbers[43];
    public static final VehicleGroupAffected traffic = cNamedNumbers[44];
    
    protected final static long cFirstNumber = 9217;
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
	if (value >= 9217 && value <= 9261)
	    return (int)(value - 9217);
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static VehicleGroupAffected valueOf(long value)
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
	    "VehicleGroupAffected"
	),
	new QName (
	    "ITIS",
	    "VehicleGroupAffected"
	),
	274454,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "all-vehicles",
		    9217
		),
		new MemberListElement (
		    "bicycles",
		    9218
		),
		new MemberListElement (
		    "motorcycles",
		    9219
		),
		new MemberListElement (
		    "cars",
		    9220
		),
		new MemberListElement (
		    "light-vehicles",
		    9221
		),
		new MemberListElement (
		    "cars-and-light-vehicles",
		    9222
		),
		new MemberListElement (
		    "cars-with-trailers",
		    9223
		),
		new MemberListElement (
		    "cars-with-recreational-trailers",
		    9224
		),
		new MemberListElement (
		    "vehicles-with-trailers",
		    9225
		),
		new MemberListElement (
		    "heavy-vehicles",
		    9226
		),
		new MemberListElement (
		    "trucks",
		    9227
		),
		new MemberListElement (
		    "buses",
		    9228
		),
		new MemberListElement (
		    "articulated-buses",
		    9229
		),
		new MemberListElement (
		    "school-buses",
		    9230
		),
		new MemberListElement (
		    "vehicles-with-semi-trailers",
		    9231
		),
		new MemberListElement (
		    "vehicles-with-double-trailers",
		    9232
		),
		new MemberListElement (
		    "high-profile-vehicles",
		    9233
		),
		new MemberListElement (
		    "wide-vehicles",
		    9234
		),
		new MemberListElement (
		    "long-vehicles",
		    9235
		),
		new MemberListElement (
		    "hazardous-loads",
		    9236
		),
		new MemberListElement (
		    "exceptional-loads",
		    9237
		),
		new MemberListElement (
		    "abnormal-loads",
		    9238
		),
		new MemberListElement (
		    "convoys",
		    9239
		),
		new MemberListElement (
		    "maintenance-vehicles",
		    9240
		),
		new MemberListElement (
		    "delivery-vehicles",
		    9241
		),
		new MemberListElement (
		    "vehicles-with-even-numbered-license-plates",
		    9242
		),
		new MemberListElement (
		    "vehicles-with-odd-numbered-license-plates",
		    9243
		),
		new MemberListElement (
		    "vehicles-with-parking-permits",
		    9244
		),
		new MemberListElement (
		    "vehicles-with-catalytic-converters",
		    9245
		),
		new MemberListElement (
		    "vehicles-without-catalytic-converters",
		    9246
		),
		new MemberListElement (
		    "gas-powered-vehicles",
		    9247
		),
		new MemberListElement (
		    "diesel-powered-vehicles",
		    9248
		),
		new MemberListElement (
		    "lPG-vehicles",
		    9249
		),
		new MemberListElement (
		    "military-convoys",
		    9250
		),
		new MemberListElement (
		    "military-vehicles",
		    9251
		),
		new MemberListElement (
		    "electric-powered-vehicles",
		    9252
		),
		new MemberListElement (
		    "hybrid-powered-vehicles",
		    9253
		),
		new MemberListElement (
		    "inherently-low-emisson-vehicles",
		    9254
		),
		new MemberListElement (
		    "commerical-vehicles",
		    9255
		),
		new MemberListElement (
		    "runaway-vehicles",
		    9256
		),
		new MemberListElement (
		    "vehicles-with-lugs",
		    9257
		),
		new MemberListElement (
		    "motor-driven-cycles",
		    9258
		),
		new MemberListElement (
		    "recreational-vehicles",
		    9259
		),
		new MemberListElement (
		    "non-motorized-vehicles",
		    9260
		),
		new MemberListElement (
		    "traffic",
		    9261
		)
	    }
	),
	0,
	all_vehicles
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' VehicleGroupAffected object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleGroupAffected object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final VehicleGroupAffected cUnknownEnumerator = 
	new VehicleGroupAffected(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for VehicleGroupAffected
