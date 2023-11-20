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

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ProbeVehicleData from ASN1 Module DSRC.
 * @see Sequence
 */

public class ProbeVehicleData extends Sequence {
    
    /**
     * The default constructor.
     */
    public ProbeVehicleData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ProbeVehicleData(MinuteOfTheYear timeStamp, 
		    ProbeSegmentNumber segNum, VehicleIdent probeID, 
		    FullPositionVector startVector, 
		    VehicleClassification vehicleType, Snapshots snapshots, 
		    Regional regional)
    {
	setTimeStamp(timeStamp);
	setSegNum(segNum);
	setProbeID(probeID);
	setStartVector(startVector);
	setVehicleType(vehicleType);
	setSnapshots(snapshots);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public ProbeVehicleData(FullPositionVector startVector, 
		    VehicleClassification vehicleType, Snapshots snapshots)
    {
	setStartVector(startVector);
	setVehicleType(vehicleType);
	setSnapshots(snapshots);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MinuteOfTheYear();
	mComponents[1] = new ProbeSegmentNumber();
	mComponents[2] = new VehicleIdent();
	mComponents[3] = new FullPositionVector();
	mComponents[4] = new VehicleClassification();
	mComponents[5] = new Snapshots();
	mComponents[6] = new Regional();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MinuteOfTheYear();
	    case 1:
		return new ProbeSegmentNumber();
	    case 2:
		return new VehicleIdent();
	    case 3:
		return new FullPositionVector();
	    case 4:
		return new VehicleClassification();
	    case 5:
		return new Snapshots();
	    case 6:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timeStamp"
    public MinuteOfTheYear getTimeStamp()
    {
	return (MinuteOfTheYear)mComponents[0];
    }
    
    public void setTimeStamp(MinuteOfTheYear timeStamp)
    {
	mComponents[0] = timeStamp;
    }
    
    public boolean hasTimeStamp()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTimeStamp()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "segNum"
    public ProbeSegmentNumber getSegNum()
    {
	return (ProbeSegmentNumber)mComponents[1];
    }
    
    public void setSegNum(ProbeSegmentNumber segNum)
    {
	mComponents[1] = segNum;
    }
    
    public boolean hasSegNum()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSegNum()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "probeID"
    public VehicleIdent getProbeID()
    {
	return (VehicleIdent)mComponents[2];
    }
    
    public void setProbeID(VehicleIdent probeID)
    {
	mComponents[2] = probeID;
    }
    
    public boolean hasProbeID()
    {
	return componentIsPresent(2);
    }
    
    public void deleteProbeID()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "startVector"
    public FullPositionVector getStartVector()
    {
	return (FullPositionVector)mComponents[3];
    }
    
    public void setStartVector(FullPositionVector startVector)
    {
	mComponents[3] = startVector;
    }
    
    
    // Methods for field "vehicleType"
    public VehicleClassification getVehicleType()
    {
	return (VehicleClassification)mComponents[4];
    }
    
    public void setVehicleType(VehicleClassification vehicleType)
    {
	mComponents[4] = vehicleType;
    }
    
    
    // Methods for field "snapshots"
    public Snapshots getSnapshots()
    {
	return (Snapshots)mComponents[5];
    }
    
    public void setSnapshots(Snapshots snapshots)
    {
	mComponents[5] = snapshots;
    }
    
    
    
    /**
     * Define the ASN1 Type Snapshots from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Snapshots extends SequenceOf<Snapshot> {
	
	/**
	 * The default constructor.
	 */
	public Snapshots()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Snapshots(Snapshot[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Snapshot();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"ProbeVehicleData$Snapshots"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    274450,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new INTEGER(1),
			new INTEGER(32),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(32)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.dsrc",
		    "Snapshot"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Snapshots object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Snapshots object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Snapshots

    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[6];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[6] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(6);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(6);
    }
    
    
    
    /**
     * Define the ASN1 Type Regional from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Regional extends SequenceOf<Regional.Sequence_> {
	
	/**
	 * The default constructor.
	 */
	public Regional()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Regional(Sequence_[] elements)
	{
	    super(elements);
	}
	
	
	/**
	 * Define the ASN1 Type Sequence_ from ASN1 Module DSRC.
	 * @see Sequence
	 */
	public static class Sequence_ extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Sequence_()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Sequence_(RegionId regionId, OpenType regExtValue)
	    {
		setRegionId(regionId);
		setRegExtValue(regExtValue);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RegionId();
		mComponents[1] = new OpenType();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[2];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new RegionId();
		    case 1:
			return new OpenType();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "regionId"
	    public RegionId getRegionId()
	    {
		return (RegionId)mComponents[0];
	    }
	    
	    public void setRegionId(RegionId regionId)
	    {
		mComponents[0] = regionId;
	    }
	    
	    
	    // Methods for field "regExtValue"
	    public OpenType getRegExtValue()
	    {
		return (OpenType)mComponents[1];
	    }
	    
	    public void setRegExtValue(OpenType regExtValue)
	    {
		mComponents[1] = regExtValue;
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
		    "ProbeVehicleData$Regional$Sequence_"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		274962,
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
					"RegionId"
				    ),
				    new QName (
					"DSRC",
					"RegionId"
				    ),
				    274450,
				    new Intersection (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new RegionId(0), 
						new RegionId(255),
						0
					    )
					),
					new TableConstraint (
					    dsrc.region.REGION.reg_ProbeVehicleData,
					    0
					)
				    ),
				    new Bounds (
					Long.valueOf(0),
					Long.valueOf(255)
				    ),
				    null
				)
			    ),
			    "regionId",
			    0,
			    274,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new OpenTypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"OpenType"
				    ),
				    new QName (
					"builtin",
					"OpenType"
				    ),
				    1323026,
				    new ComponentRelationConstraint (
					new TableConstraint (
					    dsrc.region.REGION.reg_ProbeVehicleData,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "ProbeVehicleData$Regional$Sequence_"
							),
							0
						    ),
						    0
						)
					    }
					)
				    ),
				    new ComponentRelationConstraint (
					new TableConstraint (
					    dsrc.region.REGION.reg_ProbeVehicleData,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "ProbeVehicleData$Regional$Sequence_"
							),
							0
						    ),
						    0
						)
					    }
					)
				    )
				)
			    ),
			    "regExtValue",
			    1,
			    2,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Sequence_ object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Sequence_ object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Sequence_

	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Sequence_();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"ProbeVehicleData$Regional"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    274450,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new INTEGER(1),
			new INTEGER(4),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(4)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.dsrc",
		    "ProbeVehicleData$Regional$Sequence_"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Regional object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Regional object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Regional

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
	    "ProbeVehicleData"
	),
	new QName (
	    "DSRC",
	    "ProbeVehicleData"
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
				"MinuteOfTheYear"
			    ),
			    new QName (
				"DSRC",
				"MinuteOfTheYear"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MinuteOfTheYear(0), 
				    new MinuteOfTheYear(527040),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(527040)
			    ),
			    null
			)
		    ),
		    "timeStamp",
		    0,
		    3,
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
				"ProbeSegmentNumber"
			    ),
			    new QName (
				"DSRC",
				"ProbeSegmentNumber"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ProbeSegmentNumber(0), 
				    new ProbeSegmentNumber(32767),
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
		    "segNum",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VehicleIdent"
			    ),
			    new QName (
				"DSRC",
				"VehicleIdent"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleIdent"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleIdent"
				)
			    ),
			    0
			)
		    ),
		    "probeID",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"FullPositionVector"
			    ),
			    new QName (
				"DSRC",
				"FullPositionVector"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "FullPositionVector"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "FullPositionVector"
				)
			    ),
			    0
			)
		    ),
		    "startVector",
		    3,
		    2,
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
				"VehicleClassification"
			    ),
			    new QName (
				"DSRC",
				"VehicleClassification"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleClassification"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleClassification"
				)
			    ),
			    0
			)
		    ),
		    "vehicleType",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "ProbeVehicleData$Snapshots"
			)
		    ),
		    "snapshots",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "ProbeVehicleData$Regional"
			)
		    ),
		    "regional",
		    6,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ProbeVehicleData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ProbeVehicleData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ProbeVehicleData
