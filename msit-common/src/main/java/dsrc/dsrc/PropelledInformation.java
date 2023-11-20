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
import com.oss.asn1.Choice;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type PropelledInformation from ASN1 Module DSRC.
 * @see Choice
 */

public class PropelledInformation extends Choice {
    
    /**
     * The default constructor.
     */
    public PropelledInformation()
    {
    }
    
    public static final  int  human_chosen = 1;
    public static final  int  animal_chosen = 2;
    public static final  int  motor_chosen = 3;
    
    // Methods for field "human"
    public static PropelledInformation createPropelledInformationWithHuman(HumanPropelledType human)
    {
	PropelledInformation __object = new PropelledInformation();

	__object.setHuman(human);
	return __object;
    }
    
    public boolean hasHuman()
    {
	return getChosenFlag() == human_chosen;
    }
    
    public HumanPropelledType getHuman()
    {
	if (hasHuman())
	    return (HumanPropelledType)mChosenValue;
	else
	    return null;
    }
    
    public void setHuman(HumanPropelledType human)
    {
	setChosenValue(human);
	setChosenFlag(human_chosen);
    }
    
    
    // Methods for field "animal"
    public static PropelledInformation createPropelledInformationWithAnimal(AnimalPropelledType animal)
    {
	PropelledInformation __object = new PropelledInformation();

	__object.setAnimal(animal);
	return __object;
    }
    
    public boolean hasAnimal()
    {
	return getChosenFlag() == animal_chosen;
    }
    
    public AnimalPropelledType getAnimal()
    {
	if (hasAnimal())
	    return (AnimalPropelledType)mChosenValue;
	else
	    return null;
    }
    
    public void setAnimal(AnimalPropelledType animal)
    {
	setChosenValue(animal);
	setChosenFlag(animal_chosen);
    }
    
    
    // Methods for field "motor"
    public static PropelledInformation createPropelledInformationWithMotor(MotorizedPropelledType motor)
    {
	PropelledInformation __object = new PropelledInformation();

	__object.setMotor(motor);
	return __object;
    }
    
    public boolean hasMotor()
    {
	return getChosenFlag() == motor_chosen;
    }
    
    public MotorizedPropelledType getMotor()
    {
	if (hasMotor())
	    return (MotorizedPropelledType)mChosenValue;
	else
	    return null;
    }
    
    public void setMotor(MotorizedPropelledType motor)
    {
	setChosenValue(motor);
	setChosenFlag(motor_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case human_chosen:
		return HumanPropelledType.unavailable;
	    case animal_chosen:
		return AnimalPropelledType.unavailable;
	    case motor_chosen:
		return MotorizedPropelledType.unavailable;
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "dsrc.dsrc",
	    "PropelledInformation"
	),
	new QName (
	    "DSRC",
	    "PropelledInformation"
	),
	274454,
	null,
	new FieldsDict (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"HumanPropelledType"
			    ),
			    new QName (
				"DSRC",
				"HumanPropelledType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"otherTypes",
					1
				    ),
				    new MemberListElement (
					"onFoot",
					2
				    ),
				    new MemberListElement (
					"skateboard",
					3
				    ),
				    new MemberListElement (
					"pushOrKickScooter",
					4
				    ),
				    new MemberListElement (
					"wheelchair",
					5
				    )
				}
			    ),
			    0,
			    HumanPropelledType.unavailable
			)
		    ),
		    "human",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"AnimalPropelledType"
			    ),
			    new QName (
				"DSRC",
				"AnimalPropelledType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"otherTypes",
					1
				    ),
				    new MemberListElement (
					"animalMounted",
					2
				    ),
				    new MemberListElement (
					"animalDrawnCarriage",
					3
				    )
				}
			    ),
			    0,
			    AnimalPropelledType.unavailable
			)
		    ),
		    "animal",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"MotorizedPropelledType"
			    ),
			    new QName (
				"DSRC",
				"MotorizedPropelledType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"otherTypes",
					1
				    ),
				    new MemberListElement (
					"wheelChair",
					2
				    ),
				    new MemberListElement (
					"bicycle",
					3
				    ),
				    new MemberListElement (
					"scooter",
					4
				    ),
				    new MemberListElement (
					"selfBalancingDevice",
					5
				    )
				}
			    ),
			    0,
			    MotorizedPropelledType.unavailable
			)
		    ),
		    "motor",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PropelledInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PropelledInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Check the current selection on unknown extension
     */
    public final boolean hasUnknownExtension()
    {
	return getChosenFlag() > 3;
    }
    
} // End class definition for PropelledInformation
