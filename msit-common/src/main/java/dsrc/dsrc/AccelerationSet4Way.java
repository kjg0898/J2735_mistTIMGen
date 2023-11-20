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
 * Define the ASN1 Type AccelerationSet4Way from ASN1 Module DSRC.
 * @see Sequence
 */

public class AccelerationSet4Way extends Sequence {
    
    /**
     * The default constructor.
     */
    public AccelerationSet4Way()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AccelerationSet4Way(Acceleration _long, Acceleration lat, 
		    VerticalAcceleration vert, YawRate yaw)
    {
	set_long(_long);
	setLat(lat);
	setVert(vert);
	setYaw(yaw);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Acceleration();
	mComponents[1] = new Acceleration();
	mComponents[2] = new VerticalAcceleration();
	mComponents[3] = new YawRate();
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
		return new Acceleration();
	    case 1:
		return new Acceleration();
	    case 2:
		return new VerticalAcceleration();
	    case 3:
		return new YawRate();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "_long"
    public Acceleration get_long()
    {
	return (Acceleration)mComponents[0];
    }
    
    public void set_long(Acceleration _long)
    {
	mComponents[0] = _long;
    }
    
    
    // Methods for field "lat"
    public Acceleration getLat()
    {
	return (Acceleration)mComponents[1];
    }
    
    public void setLat(Acceleration lat)
    {
	mComponents[1] = lat;
    }
    
    
    // Methods for field "vert"
    public VerticalAcceleration getVert()
    {
	return (VerticalAcceleration)mComponents[2];
    }
    
    public void setVert(VerticalAcceleration vert)
    {
	mComponents[2] = vert;
    }
    
    
    // Methods for field "yaw"
    public YawRate getYaw()
    {
	return (YawRate)mComponents[3];
    }
    
    public void setYaw(YawRate yaw)
    {
	mComponents[3] = yaw;
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
	    "AccelerationSet4Way"
	),
	new QName (
	    "DSRC",
	    "AccelerationSet4Way"
	),
	274450,
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
				"Acceleration"
			    ),
			    new QName (
				"DSRC",
				"Acceleration"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Acceleration(-2000), 
				    new Acceleration(2001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-2000),
				Long.valueOf(2001)
			    ),
			    null
			)
		    ),
		    "long",
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
				"Acceleration"
			    ),
			    new QName (
				"DSRC",
				"Acceleration"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Acceleration(-2000), 
				    new Acceleration(2001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-2000),
				Long.valueOf(2001)
			    ),
			    null
			)
		    ),
		    "lat",
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
				"dsrc.dsrc",
				"VerticalAcceleration"
			    ),
			    new QName (
				"DSRC",
				"VerticalAcceleration"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VerticalAcceleration(-127), 
				    new VerticalAcceleration(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-127),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "vert",
		    2,
		    2,
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
				"YawRate"
			    ),
			    new QName (
				"DSRC",
				"YawRate"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new YawRate(-32767), 
				    new YawRate(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "yaw",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' AccelerationSet4Way object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AccelerationSet4Way object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AccelerationSet4Way
