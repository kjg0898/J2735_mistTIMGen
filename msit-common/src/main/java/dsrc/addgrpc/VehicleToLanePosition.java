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


package dsrc.addgrpc;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type VehicleToLanePosition from ASN1 Module AddGrpC.
 * @see Sequence
 */

public class VehicleToLanePosition extends Sequence {
    
    /**
     * The default constructor.
     */
    public VehicleToLanePosition()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleToLanePosition(dsrc.dsrc.StationID stationID, 
		    dsrc.dsrc.LaneID laneID)
    {
	setStationID(stationID);
	setLaneID(laneID);
    }
    
    public void initComponents()
    {
	mComponents[0] = new dsrc.dsrc.StationID();
	mComponents[1] = new dsrc.dsrc.LaneID();
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
		return new dsrc.dsrc.StationID();
	    case 1:
		return new dsrc.dsrc.LaneID();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "stationID"
    public dsrc.dsrc.StationID getStationID()
    {
	return (dsrc.dsrc.StationID)mComponents[0];
    }
    
    public void setStationID(dsrc.dsrc.StationID stationID)
    {
	mComponents[0] = stationID;
    }
    
    
    // Methods for field "laneID"
    public dsrc.dsrc.LaneID getLaneID()
    {
	return (dsrc.dsrc.LaneID)mComponents[1];
    }
    
    public void setLaneID(dsrc.dsrc.LaneID laneID)
    {
	mComponents[1] = laneID;
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
	    "dsrc.addgrpc",
	    "VehicleToLanePosition"
	),
	new QName (
	    "AddGrpC",
	    "VehicleToLanePosition"
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
				"StationID"
			    ),
			    new QName (
				"DSRC",
				"StationID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.dsrc.StationID(0), 
				    new dsrc.dsrc.StationID(4294967295L),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(4294967295L)
			    ),
			    null
			)
		    ),
		    "stationID",
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
				"LaneID"
			    ),
			    new QName (
				"DSRC",
				"LaneID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.dsrc.LaneID(0), 
				    new dsrc.dsrc.LaneID(255),
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
		    "laneID",
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
     * Get the type descriptor (TypeInfo) of 'this' VehicleToLanePosition object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleToLanePosition object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VehicleToLanePosition
