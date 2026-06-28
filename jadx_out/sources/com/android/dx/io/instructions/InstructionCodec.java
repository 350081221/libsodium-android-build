package com.android.dx.io.instructions;

import androidx.core.view.InputDeviceCompat;
import com.android.dex.DexException;
import com.android.dx.io.IndexType;
import com.android.dx.io.OpcodeInfo;
import com.android.dx.util.Hex;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public enum InstructionCodec {
    FORMAT_00X { // from class: com.android.dx.io.instructions.InstructionCodec.1
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, i5, 0, null, 0, 0L);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(decodedInstruction.getOpcodeUnit());
        }
    },
    FORMAT_10X { // from class: com.android.dx.io.instructions.InstructionCodec.2
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, 0, InstructionCodec.byte1(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(decodedInstruction.getOpcodeUnit());
        }
    },
    FORMAT_12X { // from class: com.android.dx.io.instructions.InstructionCodec.3
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, 0, 0L, InstructionCodec.nibble2(i5), InstructionCodec.nibble3(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcodeUnit(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())));
        }
    },
    FORMAT_11N { // from class: com.android.dx.io.instructions.InstructionCodec.4
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, 0, (InstructionCodec.nibble3(i5) << 28) >> 28, InstructionCodec.nibble2(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcodeUnit(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getLiteralNibble())));
        }
    },
    FORMAT_11X { // from class: com.android.dx.io.instructions.InstructionCodec.5
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, 0, 0L, InstructionCodec.byte1(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()));
        }
    },
    FORMAT_10T { // from class: com.android.dx.io.instructions.InstructionCodec.6
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, (codeInput.cursor() - 1) + ((byte) InstructionCodec.byte1(i5)), 0L);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getTargetByte(codeOutput.cursor())));
        }
    },
    FORMAT_20T { // from class: com.android.dx.io.instructions.InstructionCodec.7
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, (codeInput.cursor() - 1) + ((short) codeInput.read()), InstructionCodec.byte1(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(decodedInstruction.getOpcodeUnit(), decodedInstruction.getTargetUnit(codeOutput.cursor()));
        }
    },
    FORMAT_20BC { // from class: com.android.dx.io.instructions.InstructionCodec.8
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), codeInput.read(), IndexType.VARIES, 0, InstructionCodec.byte1(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getLiteralByte()), decodedInstruction.getIndexUnit());
        }
    },
    FORMAT_22X { // from class: com.android.dx.io.instructions.InstructionCodec.9
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, 0, 0L, InstructionCodec.byte1(i5), codeInput.read());
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), decodedInstruction.getBUnit());
        }
    },
    FORMAT_21T { // from class: com.android.dx.io.instructions.InstructionCodec.10
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, (codeInput.cursor() - 1) + ((short) codeInput.read()), 0L, InstructionCodec.byte1(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), decodedInstruction.getTargetUnit(codeOutput.cursor()));
        }
    },
    FORMAT_21S { // from class: com.android.dx.io.instructions.InstructionCodec.11
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, 0, (short) codeInput.read(), InstructionCodec.byte1(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), decodedInstruction.getLiteralUnit());
        }
    },
    FORMAT_21H { // from class: com.android.dx.io.instructions.InstructionCodec.12
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            char c5;
            int byte0 = InstructionCodec.byte0(i5);
            int byte1 = InstructionCodec.byte1(i5);
            long read = (short) codeInput.read();
            if (byte0 == 21) {
                c5 = 16;
            } else {
                c5 = '0';
            }
            return new OneRegisterDecodedInstruction(this, byte0, 0, null, 0, read << c5, byte1);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            char c5;
            int opcode = decodedInstruction.getOpcode();
            if (opcode == 21) {
                c5 = 16;
            } else {
                c5 = '0';
            }
            codeOutput.write(InstructionCodec.codeUnit(opcode, decodedInstruction.getA()), (short) (decodedInstruction.getLiteral() >> c5));
        }
    },
    FORMAT_21C { // from class: com.android.dx.io.instructions.InstructionCodec.13
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            int byte0 = InstructionCodec.byte0(i5);
            return new OneRegisterDecodedInstruction(this, byte0, codeInput.read(), OpcodeInfo.getIndexType(byte0), 0, 0L, InstructionCodec.byte1(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), decodedInstruction.getIndexUnit());
        }
    },
    FORMAT_23X { // from class: com.android.dx.io.instructions.InstructionCodec.14
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            int byte0 = InstructionCodec.byte0(i5);
            int byte1 = InstructionCodec.byte1(i5);
            int read = codeInput.read();
            return new ThreeRegisterDecodedInstruction(this, byte0, 0, null, 0, 0L, byte1, InstructionCodec.byte0(read), InstructionCodec.byte1(read));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.codeUnit(decodedInstruction.getB(), decodedInstruction.getC()));
        }
    },
    FORMAT_22B { // from class: com.android.dx.io.instructions.InstructionCodec.15
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, 0, (byte) InstructionCodec.byte1(r11), InstructionCodec.byte1(i5), InstructionCodec.byte0(codeInput.read()));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.codeUnit(decodedInstruction.getB(), decodedInstruction.getLiteralByte()));
        }
    },
    FORMAT_22T { // from class: com.android.dx.io.instructions.InstructionCodec.16
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, (codeInput.cursor() - 1) + ((short) codeInput.read()), 0L, InstructionCodec.nibble2(i5), InstructionCodec.nibble3(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())), decodedInstruction.getTargetUnit(codeOutput.cursor()));
        }
    },
    FORMAT_22S { // from class: com.android.dx.io.instructions.InstructionCodec.17
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, 0, (short) codeInput.read(), InstructionCodec.nibble2(i5), InstructionCodec.nibble3(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())), decodedInstruction.getLiteralUnit());
        }
    },
    FORMAT_22C { // from class: com.android.dx.io.instructions.InstructionCodec.18
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            int byte0 = InstructionCodec.byte0(i5);
            return new TwoRegisterDecodedInstruction(this, byte0, codeInput.read(), OpcodeInfo.getIndexType(byte0), 0, 0L, InstructionCodec.nibble2(i5), InstructionCodec.nibble3(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())), decodedInstruction.getIndexUnit());
        }
    },
    FORMAT_22CS { // from class: com.android.dx.io.instructions.InstructionCodec.19
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), codeInput.read(), IndexType.FIELD_OFFSET, 0, 0L, InstructionCodec.nibble2(i5), InstructionCodec.nibble3(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())), decodedInstruction.getIndexUnit());
        }
    },
    FORMAT_30T { // from class: com.android.dx.io.instructions.InstructionCodec.20
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, (codeInput.cursor() - 1) + codeInput.readInt(), InstructionCodec.byte1(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int target = decodedInstruction.getTarget(codeOutput.cursor());
            codeOutput.write(decodedInstruction.getOpcodeUnit(), InstructionCodec.unit0(target), InstructionCodec.unit1(target));
        }
    },
    FORMAT_32X { // from class: com.android.dx.io.instructions.InstructionCodec.21
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, 0, InstructionCodec.byte1(i5), codeInput.read(), codeInput.read());
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(decodedInstruction.getOpcodeUnit(), decodedInstruction.getAUnit(), decodedInstruction.getBUnit());
        }
    },
    FORMAT_31I { // from class: com.android.dx.io.instructions.InstructionCodec.22
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, 0, codeInput.readInt(), InstructionCodec.byte1(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int literalInt = decodedInstruction.getLiteralInt();
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.unit0(literalInt), InstructionCodec.unit1(literalInt));
        }
    },
    FORMAT_31T { // from class: com.android.dx.io.instructions.InstructionCodec.23
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            int cursor = codeInput.cursor() - 1;
            int byte0 = InstructionCodec.byte0(i5);
            int byte1 = InstructionCodec.byte1(i5);
            int readInt = cursor + codeInput.readInt();
            if (byte0 == 43 || byte0 == 44) {
                codeInput.setBaseAddress(readInt, cursor);
            }
            return new OneRegisterDecodedInstruction(this, byte0, 0, null, readInt, 0L, byte1);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int target = decodedInstruction.getTarget(codeOutput.cursor());
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.unit0(target), InstructionCodec.unit1(target));
        }
    },
    FORMAT_31C { // from class: com.android.dx.io.instructions.InstructionCodec.24
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            int byte0 = InstructionCodec.byte0(i5);
            return new OneRegisterDecodedInstruction(this, byte0, codeInput.readInt(), OpcodeInfo.getIndexType(byte0), 0, 0L, InstructionCodec.byte1(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int index = decodedInstruction.getIndex();
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.unit0(index), InstructionCodec.unit1(index));
        }
    },
    FORMAT_35C { // from class: com.android.dx.io.instructions.InstructionCodec.25
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterList(this, i5, codeInput);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterList(decodedInstruction, codeOutput);
        }
    },
    FORMAT_35MS { // from class: com.android.dx.io.instructions.InstructionCodec.26
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterList(this, i5, codeInput);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterList(decodedInstruction, codeOutput);
        }
    },
    FORMAT_35MI { // from class: com.android.dx.io.instructions.InstructionCodec.27
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterList(this, i5, codeInput);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterList(decodedInstruction, codeOutput);
        }
    },
    FORMAT_3RC { // from class: com.android.dx.io.instructions.InstructionCodec.28
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterRange(this, i5, codeInput);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterRange(decodedInstruction, codeOutput);
        }
    },
    FORMAT_3RMS { // from class: com.android.dx.io.instructions.InstructionCodec.29
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterRange(this, i5, codeInput);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterRange(decodedInstruction, codeOutput);
        }
    },
    FORMAT_3RMI { // from class: com.android.dx.io.instructions.InstructionCodec.30
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterRange(this, i5, codeInput);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterRange(decodedInstruction, codeOutput);
        }
    },
    FORMAT_51L { // from class: com.android.dx.io.instructions.InstructionCodec.31
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i5), 0, null, 0, codeInput.readLong(), InstructionCodec.byte1(i5));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            long literal = decodedInstruction.getLiteral();
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.unit0(literal), InstructionCodec.unit1(literal), InstructionCodec.unit2(literal), InstructionCodec.unit3(literal));
        }
    },
    FORMAT_45CC { // from class: com.android.dx.io.instructions.InstructionCodec.32
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            int byte0 = InstructionCodec.byte0(i5);
            if (byte0 == 250) {
                int nibble2 = InstructionCodec.nibble2(i5);
                int nibble3 = InstructionCodec.nibble3(i5);
                int read = codeInput.read();
                int read2 = codeInput.read();
                int nibble0 = InstructionCodec.nibble0(read2);
                int nibble1 = InstructionCodec.nibble1(read2);
                int nibble22 = InstructionCodec.nibble2(read2);
                int nibble32 = InstructionCodec.nibble3(read2);
                int read3 = codeInput.read();
                IndexType indexType = OpcodeInfo.getIndexType(byte0);
                if (nibble3 >= 1 && nibble3 <= 5) {
                    return new InvokePolymorphicDecodedInstruction(this, byte0, read, indexType, read3, Arrays.copyOfRange(new int[]{nibble0, nibble1, nibble22, nibble32, nibble2}, 0, nibble3));
                }
                throw new DexException("bogus registerCount: " + Hex.uNibble(nibble3));
            }
            throw new UnsupportedOperationException(String.valueOf(byte0));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InvokePolymorphicDecodedInstruction invokePolymorphicDecodedInstruction = (InvokePolymorphicDecodedInstruction) decodedInstruction;
            codeOutput.write(InstructionCodec.codeUnit(invokePolymorphicDecodedInstruction.getOpcode(), InstructionCodec.makeByte(invokePolymorphicDecodedInstruction.getG(), invokePolymorphicDecodedInstruction.getRegisterCount())), invokePolymorphicDecodedInstruction.getIndexUnit(), InstructionCodec.codeUnit(invokePolymorphicDecodedInstruction.getC(), invokePolymorphicDecodedInstruction.getD(), invokePolymorphicDecodedInstruction.getE(), invokePolymorphicDecodedInstruction.getF()), invokePolymorphicDecodedInstruction.getProtoIndex());
        }
    },
    FORMAT_4RCC { // from class: com.android.dx.io.instructions.InstructionCodec.33
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            int byte0 = InstructionCodec.byte0(i5);
            if (byte0 == 251) {
                int byte1 = InstructionCodec.byte1(i5);
                return new InvokePolymorphicRangeDecodedInstruction(this, byte0, codeInput.read(), OpcodeInfo.getIndexType(byte0), codeInput.read(), byte1, codeInput.read());
            }
            throw new UnsupportedOperationException(String.valueOf(byte0));
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getRegisterCount()), decodedInstruction.getIndexUnit(), decodedInstruction.getCUnit(), decodedInstruction.getProtoIndex());
        }
    },
    FORMAT_PACKED_SWITCH_PAYLOAD { // from class: com.android.dx.io.instructions.InstructionCodec.34
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            int baseAddressForCursor = codeInput.baseAddressForCursor() - 1;
            int read = codeInput.read();
            int readInt = codeInput.readInt();
            int[] iArr = new int[read];
            for (int i6 = 0; i6 < read; i6++) {
                iArr[i6] = codeInput.readInt() + baseAddressForCursor;
            }
            return new PackedSwitchPayloadDecodedInstruction(this, i5, readInt, iArr);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            PackedSwitchPayloadDecodedInstruction packedSwitchPayloadDecodedInstruction = (PackedSwitchPayloadDecodedInstruction) decodedInstruction;
            int[] targets = packedSwitchPayloadDecodedInstruction.getTargets();
            int baseAddressForCursor = codeOutput.baseAddressForCursor();
            codeOutput.write(packedSwitchPayloadDecodedInstruction.getOpcodeUnit());
            codeOutput.write(InstructionCodec.asUnsignedUnit(targets.length));
            codeOutput.writeInt(packedSwitchPayloadDecodedInstruction.getFirstKey());
            for (int i5 : targets) {
                codeOutput.writeInt(i5 - baseAddressForCursor);
            }
        }
    },
    FORMAT_SPARSE_SWITCH_PAYLOAD { // from class: com.android.dx.io.instructions.InstructionCodec.35
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            int baseAddressForCursor = codeInput.baseAddressForCursor() - 1;
            int read = codeInput.read();
            int[] iArr = new int[read];
            int[] iArr2 = new int[read];
            for (int i6 = 0; i6 < read; i6++) {
                iArr[i6] = codeInput.readInt();
            }
            for (int i7 = 0; i7 < read; i7++) {
                iArr2[i7] = codeInput.readInt() + baseAddressForCursor;
            }
            return new SparseSwitchPayloadDecodedInstruction(this, i5, iArr, iArr2);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            SparseSwitchPayloadDecodedInstruction sparseSwitchPayloadDecodedInstruction = (SparseSwitchPayloadDecodedInstruction) decodedInstruction;
            int[] keys = sparseSwitchPayloadDecodedInstruction.getKeys();
            int[] targets = sparseSwitchPayloadDecodedInstruction.getTargets();
            int baseAddressForCursor = codeOutput.baseAddressForCursor();
            codeOutput.write(sparseSwitchPayloadDecodedInstruction.getOpcodeUnit());
            codeOutput.write(InstructionCodec.asUnsignedUnit(targets.length));
            for (int i5 : keys) {
                codeOutput.writeInt(i5);
            }
            for (int i6 : targets) {
                codeOutput.writeInt(i6 - baseAddressForCursor);
            }
        }
    },
    FORMAT_FILL_ARRAY_DATA_PAYLOAD { // from class: com.android.dx.io.instructions.InstructionCodec.36
        @Override // com.android.dx.io.instructions.InstructionCodec
        public DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException {
            int read = codeInput.read();
            int readInt = codeInput.readInt();
            int i6 = 0;
            if (read != 1) {
                if (read != 2) {
                    if (read != 4) {
                        if (read == 8) {
                            long[] jArr = new long[readInt];
                            while (i6 < readInt) {
                                jArr[i6] = codeInput.readLong();
                                i6++;
                            }
                            return new FillArrayDataPayloadDecodedInstruction(this, i5, jArr);
                        }
                        throw new DexException("bogus element_width: " + Hex.u2(read));
                    }
                    int[] iArr = new int[readInt];
                    while (i6 < readInt) {
                        iArr[i6] = codeInput.readInt();
                        i6++;
                    }
                    return new FillArrayDataPayloadDecodedInstruction((InstructionCodec) this, i5, iArr);
                }
                short[] sArr = new short[readInt];
                while (i6 < readInt) {
                    sArr[i6] = (short) codeInput.read();
                    i6++;
                }
                return new FillArrayDataPayloadDecodedInstruction((InstructionCodec) this, i5, sArr);
            }
            byte[] bArr = new byte[readInt];
            boolean z4 = true;
            int i7 = 0;
            while (i6 < readInt) {
                if (z4) {
                    i7 = codeInput.read();
                }
                bArr[i6] = (byte) (i7 & 255);
                i7 >>= 8;
                i6++;
                z4 = !z4;
            }
            return new FillArrayDataPayloadDecodedInstruction((InstructionCodec) this, i5, bArr);
        }

        @Override // com.android.dx.io.instructions.InstructionCodec
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            FillArrayDataPayloadDecodedInstruction fillArrayDataPayloadDecodedInstruction = (FillArrayDataPayloadDecodedInstruction) decodedInstruction;
            short elementWidthUnit = fillArrayDataPayloadDecodedInstruction.getElementWidthUnit();
            Object data = fillArrayDataPayloadDecodedInstruction.getData();
            codeOutput.write(fillArrayDataPayloadDecodedInstruction.getOpcodeUnit());
            codeOutput.write(elementWidthUnit);
            codeOutput.writeInt(fillArrayDataPayloadDecodedInstruction.getSize());
            if (elementWidthUnit != 1) {
                if (elementWidthUnit != 2) {
                    if (elementWidthUnit != 4) {
                        if (elementWidthUnit == 8) {
                            codeOutput.write((long[]) data);
                            return;
                        }
                        throw new DexException("bogus element_width: " + Hex.u2(elementWidthUnit));
                    }
                    codeOutput.write((int[]) data);
                    return;
                }
                codeOutput.write((short[]) data);
                return;
            }
            codeOutput.write((byte[]) data);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static short asUnsignedUnit(int i5) {
        if (((-65536) & i5) == 0) {
            return (short) i5;
        }
        throw new IllegalArgumentException("bogus unsigned code unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int byte0(int i5) {
        return i5 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int byte1(int i5) {
        return (i5 >> 8) & 255;
    }

    private static int byte2(int i5) {
        return (i5 >> 16) & 255;
    }

    private static int byte3(int i5) {
        return i5 >>> 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static short codeUnit(int i5, int i6) {
        if ((i5 & InputDeviceCompat.SOURCE_ANY) != 0) {
            throw new IllegalArgumentException("bogus lowByte");
        }
        if ((i6 & InputDeviceCompat.SOURCE_ANY) == 0) {
            return (short) (i5 | (i6 << 8));
        }
        throw new IllegalArgumentException("bogus highByte");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DecodedInstruction decodeRegisterList(InstructionCodec instructionCodec, int i5, CodeInput codeInput) throws EOFException {
        int byte0 = byte0(i5);
        int nibble2 = nibble2(i5);
        int nibble3 = nibble3(i5);
        int read = codeInput.read();
        int read2 = codeInput.read();
        int nibble0 = nibble0(read2);
        int nibble1 = nibble1(read2);
        int nibble22 = nibble2(read2);
        int nibble32 = nibble3(read2);
        IndexType indexType = OpcodeInfo.getIndexType(byte0);
        if (nibble3 != 0) {
            if (nibble3 != 1) {
                if (nibble3 != 2) {
                    if (nibble3 != 3) {
                        if (nibble3 != 4) {
                            if (nibble3 == 5) {
                                return new FiveRegisterDecodedInstruction(instructionCodec, byte0, read, indexType, 0, 0L, nibble0, nibble1, nibble22, nibble32, nibble2);
                            }
                            throw new DexException("bogus registerCount: " + Hex.uNibble(nibble3));
                        }
                        return new FourRegisterDecodedInstruction(instructionCodec, byte0, read, indexType, 0, 0L, nibble0, nibble1, nibble22, nibble32);
                    }
                    return new ThreeRegisterDecodedInstruction(instructionCodec, byte0, read, indexType, 0, 0L, nibble0, nibble1, nibble22);
                }
                return new TwoRegisterDecodedInstruction(instructionCodec, byte0, read, indexType, 0, 0L, nibble0, nibble1);
            }
            return new OneRegisterDecodedInstruction(instructionCodec, byte0, read, indexType, 0, 0L, nibble0);
        }
        return new ZeroRegisterDecodedInstruction(instructionCodec, byte0, read, indexType, 0, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DecodedInstruction decodeRegisterRange(InstructionCodec instructionCodec, int i5, CodeInput codeInput) throws EOFException {
        int byte0 = byte0(i5);
        int byte1 = byte1(i5);
        return new RegisterRangeDecodedInstruction(instructionCodec, byte0, codeInput.read(), OpcodeInfo.getIndexType(byte0), 0, 0L, codeInput.read(), byte1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void encodeRegisterList(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
        codeOutput.write(codeUnit(decodedInstruction.getOpcode(), makeByte(decodedInstruction.getE(), decodedInstruction.getRegisterCount())), decodedInstruction.getIndexUnit(), codeUnit(decodedInstruction.getA(), decodedInstruction.getB(), decodedInstruction.getC(), decodedInstruction.getD()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void encodeRegisterRange(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
        codeOutput.write(codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getRegisterCount()), decodedInstruction.getIndexUnit(), decodedInstruction.getAUnit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int makeByte(int i5, int i6) {
        if ((i5 & (-16)) == 0) {
            if ((i6 & (-16)) == 0) {
                return i5 | (i6 << 4);
            }
            throw new IllegalArgumentException("bogus highNibble");
        }
        throw new IllegalArgumentException("bogus lowNibble");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int nibble0(int i5) {
        return i5 & 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int nibble1(int i5) {
        return (i5 >> 4) & 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int nibble2(int i5) {
        return (i5 >> 8) & 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int nibble3(int i5) {
        return (i5 >> 12) & 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static short unit0(int i5) {
        return (short) i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static short unit0(long j5) {
        return (short) j5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static short unit1(int i5) {
        return (short) (i5 >> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static short unit1(long j5) {
        return (short) (j5 >> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static short unit2(long j5) {
        return (short) (j5 >> 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static short unit3(long j5) {
        return (short) (j5 >> 48);
    }

    public abstract DecodedInstruction decode(int i5, CodeInput codeInput) throws EOFException;

    public abstract void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput);

    /* JADX INFO: Access modifiers changed from: private */
    public static short codeUnit(int i5, int i6, int i7, int i8) {
        if ((i5 & (-16)) != 0) {
            throw new IllegalArgumentException("bogus nibble0");
        }
        if ((i6 & (-16)) != 0) {
            throw new IllegalArgumentException("bogus nibble1");
        }
        if ((i7 & (-16)) != 0) {
            throw new IllegalArgumentException("bogus nibble2");
        }
        if ((i8 & (-16)) == 0) {
            return (short) (i5 | (i6 << 4) | (i7 << 8) | (i8 << 12));
        }
        throw new IllegalArgumentException("bogus nibble3");
    }
}
