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
 * Define the ASN1 Type RoadSignID from ASN1 Module DSRC.
 * @see Sequence
 */

public class RoadSignID extends Sequence {
    
    /**
     * The default constructor.
     */
    public RoadSignID()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RoadSignID(Position3D position, HeadingSlice viewAngle, 
		    MUTCDCode mutcdCode, MsgCRC crc)
    {
	setPosition(position);
	setViewAngle(viewAngle);
	setMutcdCode(mutcdCode);
	setCrc(crc);
    }
    
    /**
     * Construct with required components.
     */
    public RoadSignID(Position3D position, HeadingSlice viewAngle)
    {
	setPosition(position);
	setViewAngle(viewAngle);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Position3D();
	mComponents[1] = new HeadingSlice();
	mComponents[2] = MUTCDCode.none;
	mComponents[3] = new MsgCRC();
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
		return new Position3D();
	    case 1:
		return new HeadingSlice();
	    case 2:
		return MUTCDCode.none;
	    case 3:
		return new MsgCRC();
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
    
    
    // Methods for field "viewAngle"
    public HeadingSlice getViewAngle()
    {
	return (HeadingSlice)mComponents[1];
    }
    
    public void setViewAngle(HeadingSlice viewAngle)
    {
	mComponents[1] = viewAngle;
    }
    
    
    // Methods for field "mutcdCode"
    public MUTCDCode getMutcdCode()
    {
	return (MUTCDCode)mComponents[2];
    }
    
    public void setMutcdCode(MUTCDCode mutcdCode)
    {
	mComponents[2] = mutcdCode;
    }
    
    public boolean hasMutcdCode()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMutcdCode()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "crc"
    public MsgCRC getCrc()
    {
	return (MsgCRC)mComponents[3];
    }
    
    public void setCrc(MsgCRC crc)
    {
	mComponents[3] = crc;
    }
    
    public boolean hasCrc()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCrc()
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
	    "RoadSignID"
	),
	new QName (
	    "DSRC",
	    "RoadSignID"
	),
	274450,
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
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"HeadingSlice"
			    ),
			    new QName (
				"DSRC",
				"HeadingSlice"
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
					"from000-0to022-5degrees",
					0
				    ),
				    new MemberListElement (
					"from022-5to045-0degrees",
					1
				    ),
				    new MemberListElement (
					"from045-0to067-5degrees",
					2
				    ),
				    new MemberListElement (
					"from067-5to090-0degrees",
					3
				    ),
				    new MemberListElement (
					"from090-0to112-5degrees",
					4
				    ),
				    new MemberListElement (
					"from112-5to135-0degrees",
					5
				    ),
				    new MemberListElement (
					"from135-0to157-5degrees",
					6
				    ),
				    new MemberListElement (
					"from157-5to180-0degrees",
					7
				    ),
				    new MemberListElement (
					"from180-0to202-5degrees",
					8
				    ),
				    new MemberListElement (
					"from202-5to225-0degrees",
					9
				    ),
				    new MemberListElement (
					"from225-0to247-5degrees",
					10
				    ),
				    new MemberListElement (
					"from247-5to270-0degrees",
					11
				    ),
				    new MemberListElement (
					"from270-0to292-5degrees",
					12
				    ),
				    new MemberListElement (
					"from292-5to315-0degrees",
					13
				    ),
				    new MemberListElement (
					"from315-0to337-5degrees",
					14
				    ),
				    new MemberListElement (
					"from337-5to360-0degrees",
					15
				    )
				}
			    )
			)
		    ),
		    "viewAngle",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"MUTCDCode"
			    ),
			    new QName (
				"DSRC",
				"MUTCDCode"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"none",
					0
				    ),
				    new MemberListElement (
					"regulatory",
					1
				    ),
				    new MemberListElement (
					"warning",
					2
				    ),
				    new MemberListElement (
					"maintenance",
					3
				    ),
				    new MemberListElement (
					"motoristService",
					4
				    ),
				    new MemberListElement (
					"guide",
					5
				    ),
				    new MemberListElement (
					"rec",
					6
				    )
				}
			    ),
			    0,
			    MUTCDCode.none
			)
		    ),
		    "mutcdCode",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"MsgCRC"
			    ),
			    new QName (
				"DSRC",
				"MsgCRC"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(2)
				)
			    ),
			    new Bounds (
				Long.valueOf(2),
				Long.valueOf(2)
			    )
			)
		    ),
		    "crc",
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
     * Get the type descriptor (TypeInfo) of 'this' RoadSignID object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RoadSignID object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RoadSignID
