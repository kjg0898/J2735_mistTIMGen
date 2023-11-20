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
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ConnectionManeuverAssist_addGrpC from ASN1 Module AddGrpC.
 * @see Sequence
 */

public class ConnectionManeuverAssist_addGrpC extends Sequence {
    
    /**
     * The default constructor.
     */
    public ConnectionManeuverAssist_addGrpC()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ConnectionManeuverAssist_addGrpC(VehicleToLanePositionList vehicleToLanePositions, 
		    dsrc.dsrc.NodeOffsetPointXY rsuDistanceFromAnchor)
    {
	setVehicleToLanePositions(vehicleToLanePositions);
	setRsuDistanceFromAnchor(rsuDistanceFromAnchor);
    }
    
    /**
     * Construct with required components.
     */
    public ConnectionManeuverAssist_addGrpC(VehicleToLanePositionList vehicleToLanePositions)
    {
	setVehicleToLanePositions(vehicleToLanePositions);
    }
    
    public void initComponents()
    {
	mComponents[0] = new VehicleToLanePositionList();
	mComponents[1] = new dsrc.dsrc.NodeOffsetPointXY();
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
		return new VehicleToLanePositionList();
	    case 1:
		return new dsrc.dsrc.NodeOffsetPointXY();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "vehicleToLanePositions"
    public VehicleToLanePositionList getVehicleToLanePositions()
    {
	return (VehicleToLanePositionList)mComponents[0];
    }
    
    public void setVehicleToLanePositions(VehicleToLanePositionList vehicleToLanePositions)
    {
	mComponents[0] = vehicleToLanePositions;
    }
    
    
    // Methods for field "rsuDistanceFromAnchor"
    public dsrc.dsrc.NodeOffsetPointXY getRsuDistanceFromAnchor()
    {
	return (dsrc.dsrc.NodeOffsetPointXY)mComponents[1];
    }
    
    public void setRsuDistanceFromAnchor(dsrc.dsrc.NodeOffsetPointXY rsuDistanceFromAnchor)
    {
	mComponents[1] = rsuDistanceFromAnchor;
    }
    
    public boolean hasRsuDistanceFromAnchor()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRsuDistanceFromAnchor()
    {
	setComponentAbsent(1);
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
	    "ConnectionManeuverAssist_addGrpC"
	),
	new QName (
	    "AddGrpC",
	    "ConnectionManeuverAssist-addGrpC"
	),
	274450,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.addgrpc",
				"VehicleToLanePositionList"
			    ),
			    new QName (
				"AddGrpC",
				"VehicleToLanePositionList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(5),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(5)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.addgrpc",
				    "VehicleToLanePosition"
				)
			    )
			)
		    ),
		    "vehicleToLanePositions",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"NodeOffsetPointXY"
			    ),
			    new QName (
				"DSRC",
				"NodeOffsetPointXY"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "NodeOffsetPointXY"
				)
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
			)
		    ),
		    "rsuDistanceFromAnchor",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ConnectionManeuverAssist_addGrpC object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ConnectionManeuverAssist_addGrpC object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ConnectionManeuverAssist_addGrpC
