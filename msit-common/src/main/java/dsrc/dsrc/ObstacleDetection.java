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
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ObstacleDetection from ASN1 Module DSRC.
 * @see Sequence
 */

public class ObstacleDetection extends Sequence {
    
    /**
     * The default constructor.
     */
    public ObstacleDetection()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ObstacleDetection(ObstacleDistance obDist, 
		    ObstacleDirection obDirect, 
		    dsrc.itis.ITIScodes description, 
		    dsrc.itis.GenericLocations locationDetails, 
		    DDateTime dateTime, 
		    VerticalAccelerationThreshold vertEvent)
    {
	setObDist(obDist);
	setObDirect(obDirect);
	setDescription(description);
	setLocationDetails(locationDetails);
	setDateTime(dateTime);
	setVertEvent(vertEvent);
    }
    
    /**
     * Construct with required components.
     */
    public ObstacleDetection(ObstacleDistance obDist, 
		    ObstacleDirection obDirect, DDateTime dateTime)
    {
	setObDist(obDist);
	setObDirect(obDirect);
	setDateTime(dateTime);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ObstacleDistance();
	mComponents[1] = new ObstacleDirection();
	mComponents[2] = new dsrc.itis.ITIScodes();
	mComponents[3] = dsrc.itis.GenericLocations.on_bridges;
	mComponents[4] = new DDateTime();
	mComponents[5] = new VerticalAccelerationThreshold();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new ObstacleDistance();
	    case 1:
		return new ObstacleDirection();
	    case 2:
		return new dsrc.itis.ITIScodes();
	    case 3:
		return dsrc.itis.GenericLocations.on_bridges;
	    case 4:
		return new DDateTime();
	    case 5:
		return new VerticalAccelerationThreshold();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "obDist"
    public ObstacleDistance getObDist()
    {
	return (ObstacleDistance)mComponents[0];
    }
    
    public void setObDist(ObstacleDistance obDist)
    {
	mComponents[0] = obDist;
    }
    
    
    // Methods for field "obDirect"
    public ObstacleDirection getObDirect()
    {
	return (ObstacleDirection)mComponents[1];
    }
    
    public void setObDirect(ObstacleDirection obDirect)
    {
	mComponents[1] = obDirect;
    }
    
    
    // Methods for field "description"
    public dsrc.itis.ITIScodes getDescription()
    {
	return (dsrc.itis.ITIScodes)mComponents[2];
    }
    
    public void setDescription(dsrc.itis.ITIScodes description)
    {
	mComponents[2] = description;
    }
    
    public boolean hasDescription()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDescription()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "locationDetails"
    public dsrc.itis.GenericLocations getLocationDetails()
    {
	return (dsrc.itis.GenericLocations)mComponents[3];
    }
    
    public void setLocationDetails(dsrc.itis.GenericLocations locationDetails)
    {
	mComponents[3] = locationDetails;
    }
    
    public boolean hasLocationDetails()
    {
	return componentIsPresent(3);
    }
    
    public void deleteLocationDetails()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "dateTime"
    public DDateTime getDateTime()
    {
	return (DDateTime)mComponents[4];
    }
    
    public void setDateTime(DDateTime dateTime)
    {
	mComponents[4] = dateTime;
    }
    
    
    // Methods for field "vertEvent"
    public VerticalAccelerationThreshold getVertEvent()
    {
	return (VerticalAccelerationThreshold)mComponents[5];
    }
    
    public void setVertEvent(VerticalAccelerationThreshold vertEvent)
    {
	mComponents[5] = vertEvent;
    }
    
    public boolean hasVertEvent()
    {
	return componentIsPresent(5);
    }
    
    public void deleteVertEvent()
    {
	setComponentAbsent(5);
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "ObstacleDetection"
	),
	new QName (
	    "DSRC",
	    "ObstacleDetection"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ObstacleDistance"
			    ),
			    new QName (
				"DSRC",
				"ObstacleDistance"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ObstacleDistance(0), 
				    new ObstacleDistance(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "obDist",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ObstacleDirection"
			    ),
			    new QName (
				"DSRC",
				"ObstacleDirection"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ObstacleDirection(0), 
				    new ObstacleDirection(28800),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(28800)
			    ),
			    null
			)
		    ),
		    "obDirect",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.itis",
				"ITIScodes"
			    ),
			    new QName (
				"ITIS",
				"ITIScodes"
			    ),
			    274450,
			    new Intersection (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new dsrc.itis.ITIScodes(0), 
					new dsrc.itis.ITIScodes(65535),
					0
				    )
				),
				new ValueRangeConstraint (
				    new AbstractBounds(
					new dsrc.itis.ITIScodes(523), 
					new dsrc.itis.ITIScodes(541),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(523),
				Long.valueOf(541)
			    ),
			    null
			)
		    ),
		    "description",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.itis",
				"GenericLocations"
			    ),
			    new QName (
				"ITIS",
				"GenericLocations"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"on-bridges",
					7937
				    ),
				    new MemberListElement (
					"in-tunnels",
					7938
				    ),
				    new MemberListElement (
					"entering-or-leaving-tunnels",
					7939
				    ),
				    new MemberListElement (
					"on-ramps",
					7940
				    ),
				    new MemberListElement (
					"in-road-construction-area",
					7941
				    ),
				    new MemberListElement (
					"around-a-curve",
					7942
				    ),
				    new MemberListElement (
					"on-minor-roads",
					7943
				    ),
				    new MemberListElement (
					"in-the-opposing-lanes",
					7944
				    ),
				    new MemberListElement (
					"adjacent-to-roadway",
					7945
				    ),
				    new MemberListElement (
					"on-bend",
					7946
				    ),
				    new MemberListElement (
					"entire-intersection",
					7947
				    ),
				    new MemberListElement (
					"in-the-median",
					7948
				    ),
				    new MemberListElement (
					"moved-to-side-of-road",
					7949
				    ),
				    new MemberListElement (
					"moved-to-shoulder",
					7950
				    ),
				    new MemberListElement (
					"on-the-roadway",
					7951
				    ),
				    new MemberListElement (
					"in-shaded-areas",
					7952
				    ),
				    new MemberListElement (
					"in-low-lying-areas",
					7953
				    ),
				    new MemberListElement (
					"in-the-downtown-area",
					7954
				    ),
				    new MemberListElement (
					"in-the-inner-city-area",
					7955
				    ),
				    new MemberListElement (
					"in-parts",
					7956
				    ),
				    new MemberListElement (
					"in-some-places",
					7957
				    ),
				    new MemberListElement (
					"in-the-ditch",
					7958
				    ),
				    new MemberListElement (
					"in-the-valley",
					7959
				    ),
				    new MemberListElement (
					"on-hill-top",
					7960
				    ),
				    new MemberListElement (
					"near-the-foothills",
					7961
				    ),
				    new MemberListElement (
					"at-high-altitudes",
					7962
				    ),
				    new MemberListElement (
					"near-the-lake",
					7963
				    ),
				    new MemberListElement (
					"near-the-shore",
					7964
				    ),
				    new MemberListElement (
					"over-the-crest-of-a-hill",
					7965
				    ),
				    new MemberListElement (
					"other-than-on-the-roadway",
					7966
				    ),
				    new MemberListElement (
					"near-the-beach",
					7967
				    ),
				    new MemberListElement (
					"near-beach-access-point",
					7968
				    ),
				    new MemberListElement (
					"lower-level",
					7969
				    ),
				    new MemberListElement (
					"upper-level",
					7970
				    ),
				    new MemberListElement (
					"airport",
					7971
				    ),
				    new MemberListElement (
					"concourse",
					7972
				    ),
				    new MemberListElement (
					"gate",
					7973
				    ),
				    new MemberListElement (
					"baggage-claim",
					7974
				    ),
				    new MemberListElement (
					"customs-point",
					7975
				    ),
				    new MemberListElement (
					"station",
					7976
				    ),
				    new MemberListElement (
					"platform",
					7977
				    ),
				    new MemberListElement (
					"dock",
					7978
				    ),
				    new MemberListElement (
					"depot",
					7979
				    ),
				    new MemberListElement (
					"ev-charging-point",
					7980
				    ),
				    new MemberListElement (
					"information-welcome-point",
					7981
				    ),
				    new MemberListElement (
					"at-rest-area",
					7982
				    ),
				    new MemberListElement (
					"at-service-area",
					7983
				    ),
				    new MemberListElement (
					"at-weigh-station",
					7984
				    ),
				    new MemberListElement (
					"picnic-areas",
					7985
				    ),
				    new MemberListElement (
					"rest-area",
					7986
				    ),
				    new MemberListElement (
					"service-stations",
					7987
				    ),
				    new MemberListElement (
					"toilets",
					7988
				    ),
				    new MemberListElement (
					"on-the-right",
					7989
				    ),
				    new MemberListElement (
					"on-the-left",
					7990
				    ),
				    new MemberListElement (
					"in-the-center",
					7991
				    ),
				    new MemberListElement (
					"in-the-opposite-direction",
					7992
				    ),
				    new MemberListElement (
					"cross-traffic",
					7993
				    ),
				    new MemberListElement (
					"northbound-traffic",
					7994
				    ),
				    new MemberListElement (
					"eastbound-traffic",
					7995
				    ),
				    new MemberListElement (
					"southbound-traffic",
					7996
				    ),
				    new MemberListElement (
					"westbound-traffic",
					7997
				    ),
				    new MemberListElement (
					"north",
					7998
				    ),
				    new MemberListElement (
					"south",
					7999
				    ),
				    new MemberListElement (
					"east",
					8000
				    ),
				    new MemberListElement (
					"west",
					8001
				    ),
				    new MemberListElement (
					"northeast",
					8002
				    ),
				    new MemberListElement (
					"northwest",
					8003
				    ),
				    new MemberListElement (
					"southeast",
					8004
				    ),
				    new MemberListElement (
					"southwest",
					8005
				    ),
				    new MemberListElement (
					"mountain-pass",
					8006
				    ),
				    new MemberListElement (
					"reservation-center",
					8007
				    ),
				    new MemberListElement (
					"nearby-basin",
					8008
				    ),
				    new MemberListElement (
					"on-tracks",
					8009
				    ),
				    new MemberListElement (
					"dip",
					8010
				    ),
				    new MemberListElement (
					"traffic-circle",
					8011
				    ),
				    new MemberListElement (
					"park-and-ride-lot",
					8012
				    ),
				    new MemberListElement (
					"to",
					8014
				    ),
				    new MemberListElement (
					"by",
					8015
				    ),
				    new MemberListElement (
					"through",
					8016
				    ),
				    new MemberListElement (
					"area-of",
					8017
				    ),
				    new MemberListElement (
					"under",
					8018
				    ),
				    new MemberListElement (
					"over",
					8019
				    ),
				    new MemberListElement (
					"from",
					8020
				    ),
				    new MemberListElement (
					"approaching",
					8021
				    ),
				    new MemberListElement (
					"entering-at",
					8022
				    ),
				    new MemberListElement (
					"exiting-at",
					8023
				    ),
				    new MemberListElement (
					"across-tracks",
					8024
				    ),
				    new MemberListElement (
					"in-street",
					8025
				    ),
				    new MemberListElement (
					"on-curve",
					8026
				    ),
				    new MemberListElement (
					"shoulder",
					8027
				    ),
				    new MemberListElement (
					"crossover",
					8028
				    ),
				    new MemberListElement (
					"cross-road",
					8029
				    ),
				    new MemberListElement (
					"side-road",
					8030
				    ),
				    new MemberListElement (
					"bus-stop",
					8031
				    ),
				    new MemberListElement (
					"intersection",
					8032
				    ),
				    new MemberListElement (
					"roadside-park",
					8033
				    )
				}
			    ),
			    0,
			    dsrc.itis.GenericLocations.on_bridges
			)
		    ),
		    "locationDetails",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"DDateTime"
			    ),
			    new QName (
				"DSRC",
				"DDateTime"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "DDateTime"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "DDateTime"
				)
			    ),
			    0
			)
		    ),
		    "dateTime",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VerticalAccelerationThreshold"
			    ),
			    new QName (
				"DSRC",
				"VerticalAccelerationThreshold"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(5)
				)
			    ),
			    new Bounds (
				Long.valueOf(5),
				Long.valueOf(5)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"notEquipped",
					0
				    ),
				    new MemberListElement (
					"leftFront",
					1
				    ),
				    new MemberListElement (
					"leftRear",
					2
				    ),
				    new MemberListElement (
					"rightFront",
					3
				    ),
				    new MemberListElement (
					"rightRear",
					4
				    )
				}
			    )
			)
		    ),
		    "vertEvent",
		    5,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ObstacleDetection object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ObstacleDetection object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ObstacleDetection
