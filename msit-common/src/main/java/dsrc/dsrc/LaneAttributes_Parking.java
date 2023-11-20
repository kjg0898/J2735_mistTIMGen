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
 * Define the ASN1 Type LaneAttributes_Parking from ASN1 Module DSRC.
 * @see BitString
 */

public class LaneAttributes_Parking extends BitString {
    
    /**
     * The default constructor.
     */
    public LaneAttributes_Parking()
    {
    }
    
    /**
     * Construct Bit String from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public LaneAttributes_Parking(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct Bit String from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public LaneAttributes_Parking(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int parkingRevocableLane = 0;
    public static final int parallelParkingInUse = 1;
    public static final int headInParkingInUse = 2;
    public static final int doNotParkZone = 3;
    public static final int parkingForBusUse = 4;
    public static final int parkingForTaxiUse = 5;
    public static final int noPublicParkingUse = 6;
    
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
	    "LaneAttributes_Parking"
	),
	new QName (
	    "DSRC",
	    "LaneAttributes-Parking"
	),
	274450,
	new SizeConstraint (
	    new SingleValueConstraint (
		new INTEGER(16)
	    )
	),
	new Bounds (
	    Long.valueOf(16),
	    Long.valueOf(16)
	),
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "parkingRevocableLane",
		    0
		),
		new MemberListElement (
		    "parallelParkingInUse",
		    1
		),
		new MemberListElement (
		    "headInParkingInUse",
		    2
		),
		new MemberListElement (
		    "doNotParkZone",
		    3
		),
		new MemberListElement (
		    "parkingForBusUse",
		    4
		),
		new MemberListElement (
		    "parkingForTaxiUse",
		    5
		),
		new MemberListElement (
		    "noPublicParkingUse",
		    6
		)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LaneAttributes_Parking object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LaneAttributes_Parking object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LaneAttributes_Parking
