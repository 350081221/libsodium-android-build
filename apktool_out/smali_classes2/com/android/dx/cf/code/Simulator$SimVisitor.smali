.class Lcom/android/dx/cf/code/Simulator$SimVisitor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/cf/code/BytecodeArray$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/Simulator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SimVisitor"
.end annotation


# instance fields
.field private frame:Lcom/android/dx/cf/code/Frame;

.field private final machine:Lcom/android/dx/cf/code/Machine;

.field private previousOffset:I

.field final synthetic this$0:Lcom/android/dx/cf/code/Simulator;


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/code/Simulator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/android/dx/cf/code/Simulator;->access$000(Lcom/android/dx/cf/code/Simulator;)Lcom/android/dx/cf/code/Machine;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private checkReturnType(Lcom/android/dx/rop/type/Type;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/android/dx/cf/code/Machine;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0, p1}, Lcom/android/dx/cf/code/Merger;->isPossiblyAssignableFrom(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 18
    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v3, "return type mismatch: prototype indicates "

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, ", but encountered type "

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {v1, p1}, Lcom/android/dx/cf/code/Simulator;->access$200(Lcom/android/dx/cf/code/Simulator;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method


# virtual methods
.method public getPreviousOffset()I
    .locals 1

    iget v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->previousOffset:I

    return v0
.end method

.method public setFrame(Lcom/android/dx/cf/code/Frame;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "frame == null"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setPreviousOffset(I)V
    .locals 0

    iput p1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->previousOffset:I

    return-void
.end method

.method public visitBranch(IIII)V
    .locals 2

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    packed-switch p1, :pswitch_data_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->visitInvalid(III)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :pswitch_0
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 14
    .line 15
    sget-object v1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 16
    .line 17
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_1
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 22
    .line 23
    invoke-interface {p3}, Lcom/android/dx/cf/code/Machine;->clearArgs()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_2
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 30
    .line 31
    sget-object v1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 32
    .line 33
    invoke-interface {p3, v0, v1, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_3
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 40
    .line 41
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 42
    .line 43
    invoke-interface {p3, v0, v1, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_4
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 50
    .line 51
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 52
    .line 53
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 57
    .line 58
    invoke-interface {p3, p4}, Lcom/android/dx/cf/code/Machine;->auxTargetArg(I)V

    .line 59
    .line 60
    .line 61
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 62
    .line 63
    iget-object p4, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 64
    .line 65
    invoke-interface {p3, p4, p2, p1}, Lcom/android/dx/cf/code/Machine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x99
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    :pswitch_data_1
    .packed-switch 0xc6
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V
    .locals 3

    .line 1
    const/16 p3, 0x12

    .line 2
    .line 3
    if-eq p1, p3, :cond_6

    .line 4
    .line 5
    const/16 p3, 0x13

    .line 6
    .line 7
    if-eq p1, p3, :cond_6

    .line 8
    .line 9
    const/16 p3, 0xbd

    .line 10
    .line 11
    if-eq p1, p3, :cond_5

    .line 12
    .line 13
    const/16 p3, 0xc5

    .line 14
    .line 15
    if-eq p1, p3, :cond_4

    .line 16
    .line 17
    const/16 p3, 0xc0

    .line 18
    .line 19
    if-eq p1, p3, :cond_3

    .line 20
    .line 21
    const/16 p3, 0xc1

    .line 22
    .line 23
    if-eq p1, p3, :cond_3

    .line 24
    .line 25
    packed-switch p1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 29
    .line 30
    invoke-interface {p3}, Lcom/android/dx/cf/code/Machine;->clearArgs()V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :pswitch_0
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 36
    .line 37
    invoke-static {p3, p1}, Lcom/android/dx/cf/code/Simulator;->access$700(Lcom/android/dx/cf/code/Simulator;I)V

    .line 38
    .line 39
    .line 40
    check-cast p4, Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 41
    .line 42
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 49
    .line 50
    invoke-interface {v0, v1, p3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Prototype;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->addReference()Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 54
    .line 55
    .line 56
    move-result-object p4

    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :pswitch_1
    instance-of p3, p4, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;

    .line 60
    .line 61
    if-eqz p3, :cond_0

    .line 62
    .line 63
    check-cast p4, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;

    .line 64
    .line 65
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;->toMethodRef()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 66
    .line 67
    .line 68
    move-result-object p4

    .line 69
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 70
    .line 71
    invoke-static {p3, p1, p4}, Lcom/android/dx/cf/code/Simulator;->access$500(Lcom/android/dx/cf/code/Simulator;ILcom/android/dx/rop/cst/CstMethodRef;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    instance-of p3, p4, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 75
    .line 76
    if-eqz p3, :cond_1

    .line 77
    .line 78
    move-object p3, p4

    .line 79
    check-cast p3, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 80
    .line 81
    invoke-virtual {p3}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->isSignaturePolymorphic()Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-eqz p3, :cond_1

    .line 86
    .line 87
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 88
    .line 89
    invoke-static {p3, p1}, Lcom/android/dx/cf/code/Simulator;->access$600(Lcom/android/dx/cf/code/Simulator;I)V

    .line 90
    .line 91
    .line 92
    :cond_1
    const/16 p3, 0xb8

    .line 93
    .line 94
    if-ne p1, p3, :cond_2

    .line 95
    .line 96
    const/4 p3, 0x1

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/4 p3, 0x0

    .line 99
    :goto_0
    move-object v0, p4

    .line 100
    check-cast v0, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 101
    .line 102
    invoke-virtual {v0, p3}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype(Z)Lcom/android/dx/rop/type/Prototype;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 107
    .line 108
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 109
    .line 110
    invoke-interface {v0, v1, p3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Prototype;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_2
    move-object p3, p4

    .line 115
    check-cast p3, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 116
    .line 117
    invoke-virtual {p3}, Lcom/android/dx/rop/cst/CstFieldRef;->getType()Lcom/android/dx/rop/type/Type;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 122
    .line 123
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 124
    .line 125
    sget-object v2, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 126
    .line 127
    invoke-interface {v0, v1, v2, p3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :pswitch_3
    move-object p3, p4

    .line 132
    check-cast p3, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 133
    .line 134
    invoke-virtual {p3}, Lcom/android/dx/rop/cst/CstFieldRef;->getType()Lcom/android/dx/rop/type/Type;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 139
    .line 140
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 141
    .line 142
    invoke-interface {v0, v1, p3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    :pswitch_4
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 147
    .line 148
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 149
    .line 150
    sget-object v1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 151
    .line 152
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_4
    sget-object p3, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 157
    .line 158
    invoke-static {p3, p5}, Lcom/android/dx/rop/type/Prototype;->internInts(Lcom/android/dx/rop/type/Type;I)Lcom/android/dx/rop/type/Prototype;

    .line 159
    .line 160
    .line 161
    move-result-object p3

    .line 162
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 163
    .line 164
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 165
    .line 166
    invoke-interface {v0, v1, p3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Prototype;)V

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_5
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 171
    .line 172
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 173
    .line 174
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 175
    .line 176
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_6
    instance-of p3, p4, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 181
    .line 182
    if-nez p3, :cond_7

    .line 183
    .line 184
    instance-of p3, p4, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 185
    .line 186
    if-eqz p3, :cond_8

    .line 187
    .line 188
    :cond_7
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 189
    .line 190
    invoke-static {p3, p4}, Lcom/android/dx/cf/code/Simulator;->access$800(Lcom/android/dx/cf/code/Simulator;Lcom/android/dx/rop/cst/Constant;)V

    .line 191
    .line 192
    .line 193
    :cond_8
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 194
    .line 195
    invoke-interface {p3}, Lcom/android/dx/cf/code/Machine;->clearArgs()V

    .line 196
    .line 197
    .line 198
    :goto_1
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 199
    .line 200
    invoke-interface {p3, p5}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 201
    .line 202
    .line 203
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 204
    .line 205
    invoke-interface {p3, p4}, Lcom/android/dx/cf/code/Machine;->auxCstArg(Lcom/android/dx/rop/cst/Constant;)V

    .line 206
    .line 207
    .line 208
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 209
    .line 210
    iget-object p4, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 211
    .line 212
    invoke-interface {p3, p4, p2, p1}, Lcom/android/dx/cf/code/Machine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0xb3
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
.end method

.method public visitInvalid(III)V
    .locals 1

    new-instance p2, Lcom/android/dx/cf/code/SimException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "invalid opcode "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public visitLocal(IIIILcom/android/dx/rop/type/Type;I)V
    .locals 6

    .line 1
    const/16 v0, 0x36

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    add-int v1, p2, p3

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v1, p2

    .line 9
    :goto_0
    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 10
    .line 11
    invoke-static {v2}, Lcom/android/dx/cf/code/Simulator;->access$400(Lcom/android/dx/cf/code/Simulator;)Lcom/android/dx/cf/code/LocalVariableList;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2, v1, p4}, Lcom/android/dx/cf/code/LocalVariableList;->pcAndIndexToLocal(II)Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/android/dx/cf/code/LocalVariableList$Item;->getType()Lcom/android/dx/rop/type/Type;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Lcom/android/dx/rop/type/Type;->getBasicFrameType()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {p5}, Lcom/android/dx/rop/type/Type;->getBasicFrameType()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eq v4, v5, :cond_2

    .line 35
    .line 36
    move-object v3, p5

    .line 37
    move-object v1, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v3, p5

    .line 40
    :cond_2
    :goto_1
    const/16 v4, 0x15

    .line 41
    .line 42
    if-eq p1, v4, :cond_7

    .line 43
    .line 44
    if-eq p1, v0, :cond_5

    .line 45
    .line 46
    const/16 v0, 0x84

    .line 47
    .line 48
    if-eq p1, v0, :cond_3

    .line 49
    .line 50
    const/16 p6, 0xa9

    .line 51
    .line 52
    if-eq p1, p6, :cond_7

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->visitInvalid(III)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    if-nez v1, :cond_4

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    invoke-virtual {v1}, Lcom/android/dx/cf/code/LocalVariableList$Item;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :goto_2
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 66
    .line 67
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 68
    .line 69
    invoke-interface {p3, v0, p4}, Lcom/android/dx/cf/code/Machine;->localArg(Lcom/android/dx/cf/code/Frame;I)V

    .line 70
    .line 71
    .line 72
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 73
    .line 74
    invoke-interface {p3, p4, v3, v2}, Lcom/android/dx/cf/code/Machine;->localTarget(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/code/LocalItem;)V

    .line 75
    .line 76
    .line 77
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 78
    .line 79
    invoke-interface {p3, p5}, Lcom/android/dx/cf/code/Machine;->auxType(Lcom/android/dx/rop/type/Type;)V

    .line 80
    .line 81
    .line 82
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 83
    .line 84
    invoke-interface {p3, p6}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 85
    .line 86
    .line 87
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 88
    .line 89
    invoke-static {p6}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    .line 90
    .line 91
    .line 92
    move-result-object p4

    .line 93
    invoke-interface {p3, p4}, Lcom/android/dx/cf/code/Machine;->auxCstArg(Lcom/android/dx/rop/cst/Constant;)V

    .line 94
    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_5
    if-nez v1, :cond_6

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_6
    invoke-virtual {v1}, Lcom/android/dx/cf/code/LocalVariableList$Item;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    :goto_3
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 105
    .line 106
    iget-object p6, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 107
    .line 108
    invoke-interface {p3, p6, p5}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 109
    .line 110
    .line 111
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 112
    .line 113
    invoke-interface {p3, p5}, Lcom/android/dx/cf/code/Machine;->auxType(Lcom/android/dx/rop/type/Type;)V

    .line 114
    .line 115
    .line 116
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 117
    .line 118
    invoke-interface {p3, p4, v3, v2}, Lcom/android/dx/cf/code/Machine;->localTarget(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/code/LocalItem;)V

    .line 119
    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_7
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 123
    .line 124
    iget-object p6, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 125
    .line 126
    invoke-interface {p3, p6, p4}, Lcom/android/dx/cf/code/Machine;->localArg(Lcom/android/dx/cf/code/Frame;I)V

    .line 127
    .line 128
    .line 129
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 130
    .line 131
    if-eqz v1, :cond_8

    .line 132
    .line 133
    const/4 p4, 0x1

    .line 134
    goto :goto_4

    .line 135
    :cond_8
    const/4 p4, 0x0

    .line 136
    :goto_4
    invoke-interface {p3, p4}, Lcom/android/dx/cf/code/Machine;->localInfo(Z)V

    .line 137
    .line 138
    .line 139
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 140
    .line 141
    invoke-interface {p3, p5}, Lcom/android/dx/cf/code/Machine;->auxType(Lcom/android/dx/rop/type/Type;)V

    .line 142
    .line 143
    .line 144
    :goto_5
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 145
    .line 146
    iget-object p4, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 147
    .line 148
    invoke-interface {p3, p4, p2, p1}, Lcom/android/dx/cf/code/Machine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 149
    .line 150
    .line 151
    return-void
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
.end method

.method public visitNewarray(IILcom/android/dx/rop/cst/CstType;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/android/dx/rop/cst/CstType;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 4
    .line 5
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-interface {p2, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 11
    .line 12
    invoke-interface {p2, p4}, Lcom/android/dx/cf/code/Machine;->auxInitValues(Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 16
    .line 17
    invoke-interface {p2, p3}, Lcom/android/dx/cf/code/Machine;->auxCstArg(Lcom/android/dx/rop/cst/Constant;)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 21
    .line 22
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 23
    .line 24
    const/16 p4, 0xbc

    .line 25
    .line 26
    invoke-interface {p2, p3, p1, p4}, Lcom/android/dx/cf/code/Machine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public visitNoArgs(IIILcom/android/dx/rop/type/Type;)V
    .locals 8

    .line 1
    if-eqz p1, :cond_1a

    .line 2
    .line 3
    const/16 v0, 0xbe

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eq p1, v0, :cond_18

    .line 7
    .line 8
    const/16 v0, 0xbf

    .line 9
    .line 10
    if-eq p1, v0, :cond_17

    .line 11
    .line 12
    const/16 v0, 0xc2

    .line 13
    .line 14
    if-eq p1, v0, :cond_17

    .line 15
    .line 16
    const/16 v0, 0xc3

    .line 17
    .line 18
    if-eq p1, v0, :cond_17

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x2

    .line 23
    sparse-switch p1, :sswitch_data_0

    .line 24
    .line 25
    .line 26
    const v4, 0x32132

    .line 27
    .line 28
    .line 29
    const/16 v5, 0x3213

    .line 30
    .line 31
    const/16 v6, 0x11

    .line 32
    .line 33
    const/16 v7, 0x212

    .line 34
    .line 35
    packed-switch p1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    packed-switch p1, :pswitch_data_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->visitInvalid(III)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_0
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 48
    .line 49
    sget-object v1, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 50
    .line 51
    invoke-interface {p3, v0, v1, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :pswitch_1
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 57
    .line 58
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 59
    .line 60
    sget-object v1, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 61
    .line 62
    invoke-interface {p3, v0, v1, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :pswitch_2
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 68
    .line 69
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 70
    .line 71
    sget-object v1, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 72
    .line 73
    invoke-interface {p3, v0, v1, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :pswitch_3
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 79
    .line 80
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 81
    .line 82
    sget-object v1, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 83
    .line 84
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :pswitch_4
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 90
    .line 91
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 92
    .line 93
    sget-object v1, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 94
    .line 95
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :pswitch_5
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 101
    .line 102
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 103
    .line 104
    sget-object v1, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 105
    .line 106
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_4

    .line 110
    .line 111
    :pswitch_6
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 112
    .line 113
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 114
    .line 115
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 116
    .line 117
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_4

    .line 121
    .line 122
    :pswitch_7
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 123
    .line 124
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_0

    .line 137
    .line 138
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    if-eqz p3, :cond_0

    .line 147
    .line 148
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 149
    .line 150
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 151
    .line 152
    invoke-interface {p3, v0, v3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 153
    .line 154
    .line 155
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 156
    .line 157
    const/16 v0, 0x12

    .line 158
    .line 159
    invoke-interface {p3, v0}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_4

    .line 163
    .line 164
    :cond_0
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    throw p1

    .line 169
    :pswitch_8
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 170
    .line 171
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_3

    .line 184
    .line 185
    invoke-virtual {p3, v3}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_1

    .line 194
    .line 195
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 196
    .line 197
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 198
    .line 199
    invoke-interface {p3, v0, v3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 200
    .line 201
    .line 202
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 203
    .line 204
    invoke-interface {p3, v7}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_4

    .line 208
    .line 209
    :cond_1
    invoke-virtual {p3, v0}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 210
    .line 211
    .line 212
    move-result-object p3

    .line 213
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 214
    .line 215
    .line 216
    move-result p3

    .line 217
    if-eqz p3, :cond_2

    .line 218
    .line 219
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 220
    .line 221
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 222
    .line 223
    invoke-interface {p3, v1, v0}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 224
    .line 225
    .line 226
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 227
    .line 228
    invoke-interface {p3, v5}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_4

    .line 232
    .line 233
    :cond_2
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    throw p1

    .line 238
    :cond_3
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_6

    .line 247
    .line 248
    invoke-virtual {p3, v3}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_4

    .line 257
    .line 258
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 259
    .line 260
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 261
    .line 262
    invoke-interface {p3, v1, v0}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 263
    .line 264
    .line 265
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 266
    .line 267
    invoke-interface {p3, v4}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_4

    .line 271
    .line 272
    :cond_4
    invoke-virtual {p3, v0}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 273
    .line 274
    .line 275
    move-result-object p3

    .line 276
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 277
    .line 278
    .line 279
    move-result p3

    .line 280
    if-eqz p3, :cond_5

    .line 281
    .line 282
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 283
    .line 284
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 285
    .line 286
    const/4 v1, 0x4

    .line 287
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 288
    .line 289
    .line 290
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 291
    .line 292
    const v0, 0x432143

    .line 293
    .line 294
    .line 295
    invoke-interface {p3, v0}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_4

    .line 299
    .line 300
    :cond_5
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    throw p1

    .line 305
    :cond_6
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    throw p1

    .line 310
    :pswitch_9
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 311
    .line 312
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 313
    .line 314
    .line 315
    move-result-object p3

    .line 316
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_8

    .line 325
    .line 326
    invoke-virtual {p3, v3}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 327
    .line 328
    .line 329
    move-result-object p3

    .line 330
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 331
    .line 332
    .line 333
    move-result p3

    .line 334
    if-nez p3, :cond_7

    .line 335
    .line 336
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 337
    .line 338
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 339
    .line 340
    invoke-interface {p3, v0, v3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 341
    .line 342
    .line 343
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 344
    .line 345
    invoke-interface {p3, v7}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_4

    .line 349
    .line 350
    :cond_7
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    throw p1

    .line 355
    :cond_8
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    if-nez v1, :cond_9

    .line 364
    .line 365
    invoke-virtual {p3, v3}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 366
    .line 367
    .line 368
    move-result-object p3

    .line 369
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 370
    .line 371
    .line 372
    move-result p3

    .line 373
    if-nez p3, :cond_9

    .line 374
    .line 375
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 376
    .line 377
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 378
    .line 379
    invoke-interface {p3, v1, v0}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 380
    .line 381
    .line 382
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 383
    .line 384
    invoke-interface {p3, v4}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 385
    .line 386
    .line 387
    goto/16 :goto_4

    .line 388
    .line 389
    :cond_9
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    throw p1

    .line 394
    :pswitch_a
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 395
    .line 396
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 397
    .line 398
    .line 399
    move-result-object p3

    .line 400
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    if-nez v1, :cond_c

    .line 409
    .line 410
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    if-eqz v1, :cond_a

    .line 419
    .line 420
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 421
    .line 422
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 423
    .line 424
    invoke-interface {p3, v0, v3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 425
    .line 426
    .line 427
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 428
    .line 429
    invoke-interface {p3, v7}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 430
    .line 431
    .line 432
    goto/16 :goto_4

    .line 433
    .line 434
    :cond_a
    invoke-virtual {p3, v3}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 435
    .line 436
    .line 437
    move-result-object p3

    .line 438
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 439
    .line 440
    .line 441
    move-result p3

    .line 442
    if-eqz p3, :cond_b

    .line 443
    .line 444
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 445
    .line 446
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 447
    .line 448
    invoke-interface {p3, v1, v0}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 449
    .line 450
    .line 451
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 452
    .line 453
    invoke-interface {p3, v5}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 454
    .line 455
    .line 456
    goto/16 :goto_4

    .line 457
    .line 458
    :cond_b
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    throw p1

    .line 463
    :cond_c
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    throw p1

    .line 468
    :pswitch_b
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 469
    .line 470
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 471
    .line 472
    .line 473
    move-result-object p3

    .line 474
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-eqz v0, :cond_d

    .line 483
    .line 484
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 485
    .line 486
    .line 487
    move-result-object p3

    .line 488
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 489
    .line 490
    .line 491
    move-result p3

    .line 492
    if-eqz p3, :cond_d

    .line 493
    .line 494
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 495
    .line 496
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 497
    .line 498
    invoke-interface {p3, v0, v3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 499
    .line 500
    .line 501
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 502
    .line 503
    invoke-interface {p3, v7}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 504
    .line 505
    .line 506
    goto/16 :goto_4

    .line 507
    .line 508
    :cond_d
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 509
    .line 510
    .line 511
    move-result-object p1

    .line 512
    throw p1

    .line 513
    :pswitch_c
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 514
    .line 515
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 516
    .line 517
    .line 518
    move-result-object p3

    .line 519
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 520
    .line 521
    .line 522
    move-result-object p3

    .line 523
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 524
    .line 525
    .line 526
    move-result p3

    .line 527
    if-nez p3, :cond_e

    .line 528
    .line 529
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 530
    .line 531
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 532
    .line 533
    invoke-interface {p3, v0, v2}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 534
    .line 535
    .line 536
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 537
    .line 538
    invoke-interface {p3, v6}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 539
    .line 540
    .line 541
    goto/16 :goto_4

    .line 542
    .line 543
    :cond_e
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 544
    .line 545
    .line 546
    move-result-object p1

    .line 547
    throw p1

    .line 548
    :pswitch_d
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 549
    .line 550
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 551
    .line 552
    .line 553
    move-result-object p3

    .line 554
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    if-eqz v0, :cond_f

    .line 563
    .line 564
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 565
    .line 566
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 567
    .line 568
    invoke-interface {p3, v0, v2}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 569
    .line 570
    .line 571
    goto :goto_0

    .line 572
    :cond_f
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 573
    .line 574
    .line 575
    move-result-object p3

    .line 576
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 577
    .line 578
    .line 579
    move-result p3

    .line 580
    if-eqz p3, :cond_10

    .line 581
    .line 582
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 583
    .line 584
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 585
    .line 586
    invoke-interface {p3, v0, v3}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 587
    .line 588
    .line 589
    const/16 v6, 0x2121

    .line 590
    .line 591
    :goto_0
    const/16 p3, 0x5c

    .line 592
    .line 593
    if-ne p1, p3, :cond_1b

    .line 594
    .line 595
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 596
    .line 597
    invoke-interface {p3, v6}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 598
    .line 599
    .line 600
    goto/16 :goto_4

    .line 601
    .line 602
    :cond_10
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 603
    .line 604
    .line 605
    move-result-object p1

    .line 606
    throw p1

    .line 607
    :pswitch_e
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 608
    .line 609
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 610
    .line 611
    .line 612
    move-result-object p3

    .line 613
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 614
    .line 615
    .line 616
    move-result-object p3

    .line 617
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 618
    .line 619
    .line 620
    move-result p3

    .line 621
    if-nez p3, :cond_11

    .line 622
    .line 623
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 624
    .line 625
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 626
    .line 627
    invoke-interface {p3, v0, v2}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 628
    .line 629
    .line 630
    goto/16 :goto_4

    .line 631
    .line 632
    :cond_11
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->access$100()Lcom/android/dx/cf/code/SimException;

    .line 633
    .line 634
    .line 635
    move-result-object p1

    .line 636
    throw p1

    .line 637
    :sswitch_0
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 638
    .line 639
    invoke-interface {p3}, Lcom/android/dx/cf/code/Machine;->clearArgs()V

    .line 640
    .line 641
    .line 642
    sget-object p3, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 643
    .line 644
    invoke-direct {p0, p3}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->checkReturnType(Lcom/android/dx/rop/type/Type;)V

    .line 645
    .line 646
    .line 647
    goto/16 :goto_4

    .line 648
    .line 649
    :sswitch_1
    sget-object p3, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 650
    .line 651
    if-ne p4, p3, :cond_12

    .line 652
    .line 653
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 654
    .line 655
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 656
    .line 657
    .line 658
    move-result-object p3

    .line 659
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 660
    .line 661
    .line 662
    move-result-object p3

    .line 663
    goto :goto_1

    .line 664
    :cond_12
    move-object p3, p4

    .line 665
    :goto_1
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 666
    .line 667
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 668
    .line 669
    invoke-interface {v0, v1, p4}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 670
    .line 671
    .line 672
    invoke-direct {p0, p3}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->checkReturnType(Lcom/android/dx/rop/type/Type;)V

    .line 673
    .line 674
    .line 675
    goto/16 :goto_4

    .line 676
    .line 677
    :sswitch_2
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 678
    .line 679
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 680
    .line 681
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 682
    .line 683
    invoke-interface {p3, v0, p4, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 684
    .line 685
    .line 686
    goto/16 :goto_4

    .line 687
    .line 688
    :sswitch_3
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 689
    .line 690
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 691
    .line 692
    invoke-interface {p3, v0, p4}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 693
    .line 694
    .line 695
    goto/16 :goto_4

    .line 696
    .line 697
    :pswitch_f
    :sswitch_4
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 698
    .line 699
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 700
    .line 701
    invoke-interface {p3, v0, p4, p4}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 702
    .line 703
    .line 704
    goto/16 :goto_4

    .line 705
    .line 706
    :sswitch_5
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 707
    .line 708
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 709
    .line 710
    .line 711
    move-result-object p3

    .line 712
    invoke-virtual {p4}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 713
    .line 714
    .line 715
    move-result v1

    .line 716
    if-eqz v1, :cond_13

    .line 717
    .line 718
    move v0, v3

    .line 719
    :cond_13
    invoke-virtual {p3, v0}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    invoke-virtual {p3, v0}, Lcom/android/dx/cf/code/ExecutionStack;->peekLocal(I)Z

    .line 724
    .line 725
    .line 726
    move-result p3

    .line 727
    invoke-static {p4, v1}, Lcom/android/dx/cf/code/Simulator;->access$300(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    if-eqz p3, :cond_15

    .line 732
    .line 733
    sget-object p3, Lcom/android/dx/rop/type/Type;->KNOWN_NULL:Lcom/android/dx/rop/type/Type;

    .line 734
    .line 735
    if-ne v0, p3, :cond_14

    .line 736
    .line 737
    goto :goto_2

    .line 738
    :cond_14
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 739
    .line 740
    .line 741
    move-result-object p3

    .line 742
    :goto_2
    move-object p4, p3

    .line 743
    :cond_15
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 744
    .line 745
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 746
    .line 747
    sget-object v2, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 748
    .line 749
    invoke-interface {p3, v1, v0, v2, p4}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 750
    .line 751
    .line 752
    goto :goto_4

    .line 753
    :sswitch_6
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 754
    .line 755
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 756
    .line 757
    .line 758
    move-result-object p3

    .line 759
    invoke-virtual {p3, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 760
    .line 761
    .line 762
    move-result-object p3

    .line 763
    invoke-static {p4, p3}, Lcom/android/dx/cf/code/Simulator;->access$300(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 764
    .line 765
    .line 766
    move-result-object p3

    .line 767
    sget-object p4, Lcom/android/dx/rop/type/Type;->KNOWN_NULL:Lcom/android/dx/rop/type/Type;

    .line 768
    .line 769
    if-ne p3, p4, :cond_16

    .line 770
    .line 771
    goto :goto_3

    .line 772
    :cond_16
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 773
    .line 774
    .line 775
    move-result-object p4

    .line 776
    :goto_3
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 777
    .line 778
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 779
    .line 780
    sget-object v2, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 781
    .line 782
    invoke-interface {v0, v1, p3, v2}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V

    .line 783
    .line 784
    .line 785
    goto :goto_4

    .line 786
    :cond_17
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 787
    .line 788
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 789
    .line 790
    sget-object v1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 791
    .line 792
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 793
    .line 794
    .line 795
    goto :goto_4

    .line 796
    :cond_18
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 797
    .line 798
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 799
    .line 800
    .line 801
    move-result-object p3

    .line 802
    invoke-virtual {p3, v1}, Lcom/android/dx/cf/code/ExecutionStack;->peekType(I)Lcom/android/dx/rop/type/Type;

    .line 803
    .line 804
    .line 805
    move-result-object p3

    .line 806
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->isArrayOrKnownNull()Z

    .line 807
    .line 808
    .line 809
    move-result v0

    .line 810
    if-nez v0, :cond_19

    .line 811
    .line 812
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->this$0:Lcom/android/dx/cf/code/Simulator;

    .line 813
    .line 814
    new-instance v1, Ljava/lang/StringBuilder;

    .line 815
    .line 816
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 817
    .line 818
    .line 819
    const-string/jumbo v2, "type mismatch: expected array type but encountered "

    .line 820
    .line 821
    .line 822
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object p3

    .line 829
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object p3

    .line 836
    invoke-static {v0, p3}, Lcom/android/dx/cf/code/Simulator;->access$200(Lcom/android/dx/cf/code/Simulator;Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    :cond_19
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 840
    .line 841
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 842
    .line 843
    sget-object v1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 844
    .line 845
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 846
    .line 847
    .line 848
    goto :goto_4

    .line 849
    :cond_1a
    :sswitch_7
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 850
    .line 851
    invoke-interface {p3}, Lcom/android/dx/cf/code/Machine;->clearArgs()V

    .line 852
    .line 853
    .line 854
    :cond_1b
    :goto_4
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 855
    .line 856
    invoke-interface {p3, p4}, Lcom/android/dx/cf/code/Machine;->auxType(Lcom/android/dx/rop/type/Type;)V

    .line 857
    .line 858
    .line 859
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 860
    .line 861
    iget-object p4, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 862
    .line 863
    invoke-interface {p3, p4, p2, p1}, Lcom/android/dx/cf/code/Machine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 864
    .line 865
    .line 866
    return-void

    .line 867
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_7
        0x2e -> :sswitch_6
        0x4f -> :sswitch_5
        0x64 -> :sswitch_4
        0x68 -> :sswitch_4
        0x6c -> :sswitch_4
        0x70 -> :sswitch_4
        0x74 -> :sswitch_3
        0x78 -> :sswitch_2
        0x7a -> :sswitch_2
        0x7c -> :sswitch_2
        0x7e -> :sswitch_4
        0x80 -> :sswitch_4
        0x82 -> :sswitch_4
        0xac -> :sswitch_1
        0xb1 -> :sswitch_0
    .end sparse-switch

    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    :pswitch_data_0
    .packed-switch 0x57
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_f
    .end packed-switch

    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    :pswitch_data_1
    .packed-switch 0x85
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
.end method

.method public visitSwitch(IIILcom/android/dx/cf/code/SwitchList;I)V
    .locals 2

    .line 1
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 4
    .line 5
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-interface {p3, v0, v1}, Lcom/android/dx/cf/code/Machine;->popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V

    .line 8
    .line 9
    .line 10
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 11
    .line 12
    invoke-interface {p3, p5}, Lcom/android/dx/cf/code/Machine;->auxIntArg(I)V

    .line 13
    .line 14
    .line 15
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 16
    .line 17
    invoke-interface {p3, p4}, Lcom/android/dx/cf/code/Machine;->auxSwitchArg(Lcom/android/dx/cf/code/SwitchList;)V

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->machine:Lcom/android/dx/cf/code/Machine;

    .line 21
    .line 22
    iget-object p4, p0, Lcom/android/dx/cf/code/Simulator$SimVisitor;->frame:Lcom/android/dx/cf/code/Frame;

    .line 23
    .line 24
    invoke-interface {p3, p4, p2, p1}, Lcom/android/dx/cf/code/Machine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
.end method
