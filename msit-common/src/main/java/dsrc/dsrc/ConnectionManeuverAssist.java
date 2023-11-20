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
 * Define the ASN1 Type ConnectionManeuverAssist from ASN1 Module DSRC.
 * @see Sequence
 */

public class ConnectionManeuverAssist extends Sequence {
    
    /**
     * The default constructor.
     */
    public ConnectionManeuverAssist()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ConnectionManeuverAssist(LaneConnectionID connectionID, 
		    ZoneLength queueLength, ZoneLength availableStorageLength, 
		    WaitOnStopline waitOnStop, 
		    PedestrianBicycleDetect pedBicycleDetect, 
		    Regional regional)
    {
	setConnectionID(connectionID);
	setQueueLength(queueLength);
	setAvailableStorageLength(availableStorageLength);
	setWaitOnStop(waitOnStop);
	setPedBicycleDetect(pedBicycleDetect);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public ConnectionManeuverAssist(LaneConnectionID connectionID)
    {
	setConnectionID(connectionID);
    }
    
    public void initComponents()
    {
	mComponents[0] = new LaneConnectionID();
	mComponents[1] = new ZoneLength();
	mComponents[2] = new ZoneLength();
	mComponents[3] = new WaitOnStopline();
	mComponents[4] = new PedestrianBicycleDetect();
	mComponents[5] = new Regional();
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
		return new LaneConnectionID();
	    case 1:
		return new ZoneLength();
	    case 2:
		return new ZoneLength();
	    case 3:
		return new WaitOnStopline();
	    case 4:
		return new PedestrianBicycleDetect();
	    case 5:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "connectionID"
    public LaneConnectionID getConnectionID()
    {
	return (LaneConnectionID)mComponents[0];
    }
    
    public void setConnectionID(LaneConnectionID connectionID)
    {
	mComponents[0] = connectionID;
    }
    
    
    // Methods for field "queueLength"
    public ZoneLength getQueueLength()
    {
	return (ZoneLength)mComponents[1];
    }
    
    public void setQueueLength(ZoneLength queueLength)
    {
	mComponents[1] = queueLength;
    }
    
    public boolean hasQueueLength()
    {
	return componentIsPresent(1);
    }
    
    public void deleteQueueLength()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "availableStorageLength"
    public ZoneLength getAvailableStorageLength()
    {
	return (ZoneLength)mComponents[2];
    }
    
    public void setAvailableStorageLength(ZoneLength availableStorageLength)
    {
	mComponents[2] = availableStorageLength;
    }
    
    public boolean hasAvailableStorageLength()
    {
	return componentIsPresent(2);
    }
    
    public void deleteAvailableStorageLength()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "waitOnStop"
    public WaitOnStopline getWaitOnStop()
    {
	return (WaitOnStopline)mComponents[3];
    }
    
    public void setWaitOnStop(WaitOnStopline waitOnStop)
    {
	mComponents[3] = waitOnStop;
    }
    
    public boolean hasWaitOnStop()
    {
	return componentIsPresent(3);
    }
    
    public void deleteWaitOnStop()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "pedBicycleDetect"
    public PedestrianBicycleDetect getPedBicycleDetect()
    {
	return (PedestrianBicycleDetect)mComponents[4];
    }
    
    public void setPedBicycleDetect(PedestrianBicycleDetect pedBicycleDetect)
    {
	mComponents[4] = pedBicycleDetect;
    }
    
    public boolean hasPedBicycleDetect()
    {
	return componentIsPresent(4);
    }
    
    public void deletePedBicycleDetect()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[5];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[5] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(5);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(5);
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
		    "ConnectionManeuverAssist$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_ConnectionManeuverAssist,
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
					    dsrc.region.REGION.reg_ConnectionManeuverAssist,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "ConnectionManeuverAssist$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_ConnectionManeuverAssist,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "ConnectionManeuverAssist$Regional$Sequence_"
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
		    (short)0x8005
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"ConnectionManeuverAssist$Regional"
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
		    "ConnectionManeuverAssist$Regional$Sequence_"
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
	    "ConnectionManeuverAssist"
	),
	new QName (
	    "DSRC",
	    "ConnectionManeuverAssist"
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
				"LaneConnectionID"
			    ),
			    new QName (
				"DSRC",
				"LaneConnectionID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LaneConnectionID(0), 
				    new LaneConnectionID(255),
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
		    "connectionID",
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
				"ZoneLength"
			    ),
			    new QName (
				"DSRC",
				"ZoneLength"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ZoneLength(0), 
				    new ZoneLength(10000),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(10000)
			    ),
			    null
			)
		    ),
		    "queueLength",
		    1,
		    3,
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
				"dsrc.dsrc",
				"ZoneLength"
			    ),
			    new QName (
				"DSRC",
				"ZoneLength"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ZoneLength(0), 
				    new ZoneLength(10000),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(10000)
			    ),
			    null
			)
		    ),
		    "availableStorageLength",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"WaitOnStopline"
			    ),
			    new QName (
				"DSRC",
				"WaitOnStopline"
			    ),
			    274450,
			    null
			)
		    ),
		    "waitOnStop",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PedestrianBicycleDetect"
			    ),
			    new QName (
				"DSRC",
				"PedestrianBicycleDetect"
			    ),
			    274450,
			    null
			)
		    ),
		    "pedBicycleDetect",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "ConnectionManeuverAssist$Regional"
			)
		    ),
		    "regional",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' ConnectionManeuverAssist object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ConnectionManeuverAssist object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ConnectionManeuverAssist
