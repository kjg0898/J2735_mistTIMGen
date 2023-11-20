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

import com.oss.asn1.BitString;
import com.oss.asn1.INTEGER;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type LaneAttributes_Vehicle from ASN1 Module DSRC.
 * @see BitString
 */

public class LaneAttributes_Vehicle extends BitString {
    
    /**
     * The default constructor.
     */
    public LaneAttributes_Vehicle()
    {
    }
    
    /**
     * Construct Bit String from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public LaneAttributes_Vehicle(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct Bit String from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public LaneAttributes_Vehicle(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int isVehicleRevocableLane = 0;
    public static final int isVehicleFlyOverLane = 1;
    public static final int hovLaneUseOnly = 2;
    public static final int restrictedToBusUse = 3;
    public static final int restrictedToTaxiUse = 4;
    public static final int restrictedFromPublicUse = 5;
    public static final int hasIRbeaconCoverage = 6;
    public static final int permissionOnRequest = 7;
    
    /**
     * Initialize the type descriptor.
     */
    private static final BitStringInfo c_typeinfo = new BitStringInfo (
	new Tags (
	    new short[] {
		0x0003
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "LaneAttributes_Vehicle"
	),
	new QName (
	    "DSRC",
	    "LaneAttributes-Vehicle"
	),
	274454,
	new SizeConstraint (
	    new ExtensibleConstraint (
		new SingleValueConstraint (
		    new INTEGER(8)
		),
		null
	    )
	),
	new Bounds (
	    Long.valueOf(8),
	    Long.valueOf(8)
	),
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "isVehicleRevocableLane",
		    0
		),
		new MemberListElement (
		    "isVehicleFlyOverLane",
		    1
		),
		new MemberListElement (
		    "hovLaneUseOnly",
		    2
		),
		new MemberListElement (
		    "restrictedToBusUse",
		    3
		),
		new MemberListElement (
		    "restrictedToTaxiUse",
		    4
		),
		new MemberListElement (
		    "restrictedFromPublicUse",
		    5
		),
		new MemberListElement (
		    "hasIRbeaconCoverage",
		    6
		),
		new MemberListElement (
		    "permissionOnRequest",
		    7
		)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LaneAttributes_Vehicle object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LaneAttributes_Vehicle object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LaneAttributes_Vehicle
