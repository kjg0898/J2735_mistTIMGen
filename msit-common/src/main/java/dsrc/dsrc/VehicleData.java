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
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type VehicleData from ASN1 Module DSRC.
 * @see Sequence
 */

public class VehicleData extends Sequence {
    
    /**
     * The default constructor.
     */
    public VehicleData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleData(VehicleHeight height, BumperHeights bumpers, 
		    VehicleMass mass, TrailerWeight trailerWeight)
    {
	setHeight(height);
	setBumpers(bumpers);
	setMass(mass);
	setTrailerWeight(trailerWeight);
    }
    
    public void initComponents()
    {
	mComponents[0] = new VehicleHeight();
	mComponents[1] = new BumperHeights();
	mComponents[2] = new VehicleMass();
	mComponents[3] = new TrailerWeight();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new VehicleHeight();
	    case 1:
		return new BumperHeights();
	    case 2:
		return new VehicleMass();
	    case 3:
		return new TrailerWeight();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "height"
    public VehicleHeight getHeight()
    {
	return (VehicleHeight)mComponents[0];
    }
    
    public void setHeight(VehicleHeight height)
    {
	mComponents[0] = height;
    }
    
    public boolean hasHeight()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHeight()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "bumpers"
    public BumperHeights getBumpers()
    {
	return (BumperHeights)mComponents[1];
    }
    
    public void setBumpers(BumperHeights bumpers)
    {
	mComponents[1] = bumpers;
    }
    
    public boolean hasBumpers()
    {
	return componentIsPresent(1);
    }
    
    public void deleteBumpers()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "mass"
    public VehicleMass getMass()
    {
	return (VehicleMass)mComponents[2];
    }
    
    public void setMass(VehicleMass mass)
    {
	mComponents[2] = mass;
    }
    
    public boolean hasMass()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMass()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "trailerWeight"
    public TrailerWeight getTrailerWeight()
    {
	return (TrailerWeight)mComponents[3];
    }
    
    public void setTrailerWeight(TrailerWeight trailerWeight)
    {
	mComponents[3] = trailerWeight;
    }
    
    public boolean hasTrailerWeight()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTrailerWeight()
    {
	setComponentAbsent(3);
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
	    "VehicleData"
	),
	new QName (
	    "DSRC",
	    "VehicleData"
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
				"VehicleHeight"
			    ),
			    new QName (
				"DSRC",
				"VehicleHeight"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VehicleHeight(0), 
				    new VehicleHeight(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "height",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"BumperHeights"
			    ),
			    new QName (
				"DSRC",
				"BumperHeights"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "BumperHeights"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "BumperHeights"
				)
			    ),
			    0
			)
		    ),
		    "bumpers",
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
				"VehicleMass"
			    ),
			    new QName (
				"DSRC",
				"VehicleMass"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VehicleMass(0), 
				    new VehicleMass(255),
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
		    "mass",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"TrailerWeight"
			    ),
			    new QName (
				"DSRC",
				"TrailerWeight"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TrailerWeight(0), 
				    new TrailerWeight(64255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(64255)
			    ),
			    null
			)
		    ),
		    "trailerWeight",
		    3,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' VehicleData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VehicleData
