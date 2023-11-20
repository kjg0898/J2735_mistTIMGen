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

import com.oss.asn1.AbstractData;
import com.oss.asn1.Choice;
import com.oss.asn1.INTEGER;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type LaneTypeAttributes from ASN1 Module DSRC.
 * @see Choice
 */

public class LaneTypeAttributes extends Choice {
    
    /**
     * The default constructor.
     */
    public LaneTypeAttributes()
    {
    }
    
    public static final  int  vehicle_chosen = 1;
    public static final  int  crosswalk_chosen = 2;
    public static final  int  bikeLane_chosen = 3;
    public static final  int  sidewalk_chosen = 4;
    public static final  int  median_chosen = 5;
    public static final  int  striping_chosen = 6;
    public static final  int  trackedVehicle_chosen = 7;
    public static final  int  parking_chosen = 8;
    
    // Methods for field "vehicle"
    public static LaneTypeAttributes createLaneTypeAttributesWithVehicle(LaneAttributes_Vehicle vehicle)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setVehicle(vehicle);
	return __object;
    }
    
    public boolean hasVehicle()
    {
	return getChosenFlag() == vehicle_chosen;
    }
    
    public LaneAttributes_Vehicle getVehicle()
    {
	if (hasVehicle())
	    return (LaneAttributes_Vehicle)mChosenValue;
	else
	    return null;
    }
    
    public void setVehicle(LaneAttributes_Vehicle vehicle)
    {
	setChosenValue(vehicle);
	setChosenFlag(vehicle_chosen);
    }
    
    
    // Methods for field "crosswalk"
    public static LaneTypeAttributes createLaneTypeAttributesWithCrosswalk(LaneAttributes_Crosswalk crosswalk)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setCrosswalk(crosswalk);
	return __object;
    }
    
    public boolean hasCrosswalk()
    {
	return getChosenFlag() == crosswalk_chosen;
    }
    
    public LaneAttributes_Crosswalk getCrosswalk()
    {
	if (hasCrosswalk())
	    return (LaneAttributes_Crosswalk)mChosenValue;
	else
	    return null;
    }
    
    public void setCrosswalk(LaneAttributes_Crosswalk crosswalk)
    {
	setChosenValue(crosswalk);
	setChosenFlag(crosswalk_chosen);
    }
    
    
    // Methods for field "bikeLane"
    public static LaneTypeAttributes createLaneTypeAttributesWithBikeLane(LaneAttributes_Bike bikeLane)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setBikeLane(bikeLane);
	return __object;
    }
    
    public boolean hasBikeLane()
    {
	return getChosenFlag() == bikeLane_chosen;
    }
    
    public LaneAttributes_Bike getBikeLane()
    {
	if (hasBikeLane())
	    return (LaneAttributes_Bike)mChosenValue;
	else
	    return null;
    }
    
    public void setBikeLane(LaneAttributes_Bike bikeLane)
    {
	setChosenValue(bikeLane);
	setChosenFlag(bikeLane_chosen);
    }
    
    
    // Methods for field "sidewalk"
    public static LaneTypeAttributes createLaneTypeAttributesWithSidewalk(LaneAttributes_Sidewalk sidewalk)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setSidewalk(sidewalk);
	return __object;
    }
    
    public boolean hasSidewalk()
    {
	return getChosenFlag() == sidewalk_chosen;
    }
    
    public LaneAttributes_Sidewalk getSidewalk()
    {
	if (hasSidewalk())
	    return (LaneAttributes_Sidewalk)mChosenValue;
	else
	    return null;
    }
    
    public void setSidewalk(LaneAttributes_Sidewalk sidewalk)
    {
	setChosenValue(sidewalk);
	setChosenFlag(sidewalk_chosen);
    }
    
    
    // Methods for field "median"
    public static LaneTypeAttributes createLaneTypeAttributesWithMedian(LaneAttributes_Barrier median)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setMedian(median);
	return __object;
    }
    
    public boolean hasMedian()
    {
	return getChosenFlag() == median_chosen;
    }
    
    public LaneAttributes_Barrier getMedian()
    {
	if (hasMedian())
	    return (LaneAttributes_Barrier)mChosenValue;
	else
	    return null;
    }
    
    public void setMedian(LaneAttributes_Barrier median)
    {
	setChosenValue(median);
	setChosenFlag(median_chosen);
    }
    
    
    // Methods for field "striping"
    public static LaneTypeAttributes createLaneTypeAttributesWithStriping(LaneAttributes_Striping striping)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setStriping(striping);
	return __object;
    }
    
    public boolean hasStriping()
    {
	return getChosenFlag() == striping_chosen;
    }
    
    public LaneAttributes_Striping getStriping()
    {
	if (hasStriping())
	    return (LaneAttributes_Striping)mChosenValue;
	else
	    return null;
    }
    
    public void setStriping(LaneAttributes_Striping striping)
    {
	setChosenValue(striping);
	setChosenFlag(striping_chosen);
    }
    
    
    // Methods for field "trackedVehicle"
    public static LaneTypeAttributes createLaneTypeAttributesWithTrackedVehicle(LaneAttributes_TrackedVehicle trackedVehicle)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setTrackedVehicle(trackedVehicle);
	return __object;
    }
    
    public boolean hasTrackedVehicle()
    {
	return getChosenFlag() == trackedVehicle_chosen;
    }
    
    public LaneAttributes_TrackedVehicle getTrackedVehicle()
    {
	if (hasTrackedVehicle())
	    return (LaneAttributes_TrackedVehicle)mChosenValue;
	else
	    return null;
    }
    
    public void setTrackedVehicle(LaneAttributes_TrackedVehicle trackedVehicle)
    {
	setChosenValue(trackedVehicle);
	setChosenFlag(trackedVehicle_chosen);
    }
    
    
    // Methods for field "parking"
    public static LaneTypeAttributes createLaneTypeAttributesWithParking(LaneAttributes_Parking parking)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setParking(parking);
	return __object;
    }
    
    public boolean hasParking()
    {
	return getChosenFlag() == parking_chosen;
    }
    
    public LaneAttributes_Parking getParking()
    {
	if (hasParking())
	    return (LaneAttributes_Parking)mChosenValue;
	else
	    return null;
    }
    
    public void setParking(LaneAttributes_Parking parking)
    {
	setChosenValue(parking);
	setChosenFlag(parking_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case vehicle_chosen:
		return new LaneAttributes_Vehicle();
	    case crosswalk_chosen:
		return new LaneAttributes_Crosswalk();
	    case bikeLane_chosen:
		return new LaneAttributes_Bike();
	    case sidewalk_chosen:
		return new LaneAttributes_Sidewalk();
	    case median_chosen:
		return new LaneAttributes_Barrier();
	    case striping_chosen:
		return new LaneAttributes_Striping();
	    case trackedVehicle_chosen:
		return new LaneAttributes_TrackedVehicle();
	    case parking_chosen:
		return new LaneAttributes_Parking();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "dsrc.dsrc",
	    "LaneTypeAttributes"
	),
	new QName (
	    "DSRC",
	    "LaneTypeAttributes"
	),
	274454,
	null,
	new FieldsDict (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
			)
		    ),
		    "vehicle",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LaneAttributes_Crosswalk"
			    ),
			    new QName (
				"DSRC",
				"LaneAttributes-Crosswalk"
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
					"crosswalkRevocableLane",
					0
				    ),
				    new MemberListElement (
					"bicyleUseAllowed",
					1
				    ),
				    new MemberListElement (
					"isXwalkFlyOverLane",
					2
				    ),
				    new MemberListElement (
					"fixedCycleTime",
					3
				    ),
				    new MemberListElement (
					"biDirectionalCycleTimes",
					4
				    ),
				    new MemberListElement (
					"hasPushToWalkButton",
					5
				    ),
				    new MemberListElement (
					"audioSupport",
					6
				    ),
				    new MemberListElement (
					"rfSignalRequestPresent",
					7
				    ),
				    new MemberListElement (
					"unsignalizedSegmentsPresent",
					8
				    )
				}
			    )
			)
		    ),
		    "crosswalk",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LaneAttributes_Bike"
			    ),
			    new QName (
				"DSRC",
				"LaneAttributes-Bike"
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
					"bikeRevocableLane",
					0
				    ),
				    new MemberListElement (
					"pedestrianUseAllowed",
					1
				    ),
				    new MemberListElement (
					"isBikeFlyOverLane",
					2
				    ),
				    new MemberListElement (
					"fixedCycleTime",
					3
				    ),
				    new MemberListElement (
					"biDirectionalCycleTimes",
					4
				    ),
				    new MemberListElement (
					"isolatedByBarrier",
					5
				    ),
				    new MemberListElement (
					"unsignalizedSegmentsPresent",
					6
				    )
				}
			    )
			)
		    ),
		    "bikeLane",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LaneAttributes_Sidewalk"
			    ),
			    new QName (
				"DSRC",
				"LaneAttributes-Sidewalk"
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
					"sidewalk-RevocableLane",
					0
				    ),
				    new MemberListElement (
					"bicyleUseAllowed",
					1
				    ),
				    new MemberListElement (
					"isSidewalkFlyOverLane",
					2
				    ),
				    new MemberListElement (
					"walkBikes",
					3
				    )
				}
			    )
			)
		    ),
		    "sidewalk",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LaneAttributes_Barrier"
			    ),
			    new QName (
				"DSRC",
				"LaneAttributes-Barrier"
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
					"median-RevocableLane",
					0
				    ),
				    new MemberListElement (
					"median",
					1
				    ),
				    new MemberListElement (
					"whiteLineHashing",
					2
				    ),
				    new MemberListElement (
					"stripedLines",
					3
				    ),
				    new MemberListElement (
					"doubleStripedLines",
					4
				    ),
				    new MemberListElement (
					"trafficCones",
					5
				    ),
				    new MemberListElement (
					"constructionBarrier",
					6
				    ),
				    new MemberListElement (
					"trafficChannels",
					7
				    ),
				    new MemberListElement (
					"lowCurbs",
					8
				    ),
				    new MemberListElement (
					"highCurbs",
					9
				    )
				}
			    )
			)
		    ),
		    "median",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LaneAttributes_Striping"
			    ),
			    new QName (
				"DSRC",
				"LaneAttributes-Striping"
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
					"stripeToConnectingLanesRevocableLane",
					0
				    ),
				    new MemberListElement (
					"stripeDrawOnLeft",
					1
				    ),
				    new MemberListElement (
					"stripeDrawOnRight",
					2
				    ),
				    new MemberListElement (
					"stripeToConnectingLanesLeft",
					3
				    ),
				    new MemberListElement (
					"stripeToConnectingLanesRight",
					4
				    ),
				    new MemberListElement (
					"stripeToConnectingLanesAhead",
					5
				    )
				}
			    )
			)
		    ),
		    "striping",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LaneAttributes_TrackedVehicle"
			    ),
			    new QName (
				"DSRC",
				"LaneAttributes-TrackedVehicle"
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
					"spec-RevocableLane",
					0
				    ),
				    new MemberListElement (
					"spec-commuterRailRoadTrack",
					1
				    ),
				    new MemberListElement (
					"spec-lightRailRoadTrack",
					2
				    ),
				    new MemberListElement (
					"spec-heavyRailRoadTrack",
					3
				    ),
				    new MemberListElement (
					"spec-otherRailType",
					4
				    )
				}
			    )
			)
		    ),
		    "trackedVehicle",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
			)
		    ),
		    "parking",
		    7,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3),
		new TagDecoderElement((short)0x8004, 4),
		new TagDecoderElement((short)0x8005, 5),
		new TagDecoderElement((short)0x8006, 6),
		new TagDecoderElement((short)0x8007, 7)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LaneTypeAttributes object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LaneTypeAttributes object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Check the current selection on unknown extension
     */
    public final boolean hasUnknownExtension()
    {
	return getChosenFlag() > 8;
    }
    
} // End class definition for LaneTypeAttributes
