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
 * Define the ASN1 Type RequestorPositionVector from ASN1 Module DSRC.
 * @see Sequence
 */

public class RequestorPositionVector extends Sequence {
    
    /**
     * The default constructor.
     */
    public RequestorPositionVector()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RequestorPositionVector(Position3D position, Angle heading, 
		    TransmissionAndSpeed speed)
    {
	setPosition(position);
	setHeading(heading);
	setSpeed(speed);
    }
    
    /**
     * Construct with required components.
     */
    public RequestorPositionVector(Position3D position)
    {
	setPosition(position);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Position3D();
	mComponents[1] = new Angle();
	mComponents[2] = new TransmissionAndSpeed();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Position3D();
	    case 1:
		return new Angle();
	    case 2:
		return new TransmissionAndSpeed();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "position"
    public Position3D getPosition()
    {
	return (Position3D)mComponents[0];
    }
    
    public void setPosition(Position3D position)
    {
	mComponents[0] = position;
    }
    
    
    // Methods for field "heading"
    public Angle getHeading()
    {
	return (Angle)mComponents[1];
    }
    
    public void setHeading(Angle heading)
    {
	mComponents[1] = heading;
    }
    
    public boolean hasHeading()
    {
	return componentIsPresent(1);
    }
    
    public void deleteHeading()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "speed"
    public TransmissionAndSpeed getSpeed()
    {
	return (TransmissionAndSpeed)mComponents[2];
    }
    
    public void setSpeed(TransmissionAndSpeed speed)
    {
	mComponents[2] = speed;
    }
    
    public boolean hasSpeed()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSpeed()
    {
	setComponentAbsent(2);
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
	    "RequestorPositionVector"
	),
	new QName (
	    "DSRC",
	    "RequestorPositionVector"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Position3D"
			    ),
			    new QName (
				"DSRC",
				"Position3D"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Position3D"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Position3D"
				)
			    ),
			    0
			)
		    ),
		    "position",
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
				"Angle"
			    ),
			    new QName (
				"DSRC",
				"Angle"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Angle(0), 
				    new Angle(28800),
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
		    "heading",
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
				"TransmissionAndSpeed"
			    ),
			    new QName (
				"DSRC",
				"TransmissionAndSpeed"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "TransmissionAndSpeed"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "TransmissionAndSpeed"
				)
			    ),
			    0
			)
		    ),
		    "speed",
		    2,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RequestorPositionVector object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RequestorPositionVector object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RequestorPositionVector
