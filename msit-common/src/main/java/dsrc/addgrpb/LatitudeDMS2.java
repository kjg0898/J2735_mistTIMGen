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


package dsrc.addgrpb;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type LatitudeDMS2 from ASN1 Module AddGrpB.
 * @see Sequence
 */

public class LatitudeDMS2 extends Sequence {
    
    /**
     * The default constructor.
     */
    public LatitudeDMS2()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LatitudeDMS2(DegreesLat d, MinutesAngle m, SecondsAngle s)
    {
	setD(d);
	setM(m);
	setS(s);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DegreesLat();
	mComponents[1] = new MinutesAngle();
	mComponents[2] = new SecondsAngle();
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
		return new DegreesLat();
	    case 1:
		return new MinutesAngle();
	    case 2:
		return new SecondsAngle();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "d"
    public DegreesLat getD()
    {
	return (DegreesLat)mComponents[0];
    }
    
    public void setD(DegreesLat d)
    {
	mComponents[0] = d;
    }
    
    
    // Methods for field "m"
    public MinutesAngle getM()
    {
	return (MinutesAngle)mComponents[1];
    }
    
    public void setM(MinutesAngle m)
    {
	mComponents[1] = m;
    }
    
    
    // Methods for field "s"
    public SecondsAngle getS()
    {
	return (SecondsAngle)mComponents[2];
    }
    
    public void setS(SecondsAngle s)
    {
	mComponents[2] = s;
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
	    "dsrc.addgrpb",
	    "LatitudeDMS2"
	),
	new QName (
	    "AddGrpB",
	    "LatitudeDMS2"
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
				"dsrc.addgrpb",
				"DegreesLat"
			    ),
			    new QName (
				"AddGrpB",
				"DegreesLat"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DegreesLat(-90), 
				    new DegreesLat(90),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-90),
				Long.valueOf(90)
			    ),
			    null
			)
		    ),
		    "d",
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
				"dsrc.addgrpb",
				"MinutesAngle"
			    ),
			    new QName (
				"AddGrpB",
				"MinutesAngle"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MinutesAngle(0), 
				    new MinutesAngle(59),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(59)
			    ),
			    null
			)
		    ),
		    "m",
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
				"dsrc.addgrpb",
				"SecondsAngle"
			    ),
			    new QName (
				"AddGrpB",
				"SecondsAngle"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SecondsAngle(0), 
				    new SecondsAngle(5999),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(5999)
			    ),
			    null
			)
		    ),
		    "s",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LatitudeDMS2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LatitudeDMS2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LatitudeDMS2
