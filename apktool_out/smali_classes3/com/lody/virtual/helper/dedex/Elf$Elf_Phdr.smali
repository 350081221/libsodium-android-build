.class abstract Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Elf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "Elf_Phdr"
.end annotation


# instance fields
.field p_offset:I

.field p_type:I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method flagsString()Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;->getFlags()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    const-wide/16 v3, 0x4

    .line 16
    .line 17
    and-long/2addr v1, v3

    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    cmp-long v1, v1, v3

    .line 21
    .line 22
    const-string v2, "_"

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const-string v1, "R"

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v1, v2

    .line 30
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;->getFlags()J

    .line 34
    .line 35
    .line 36
    move-result-wide v5

    .line 37
    const-wide/16 v7, 0x2

    .line 38
    .line 39
    and-long/2addr v5, v7

    .line 40
    cmp-long v1, v5, v3

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    const-string v1, "W"

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v1, v2

    .line 48
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;->getFlags()J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    const-wide/16 v7, 0x1

    .line 56
    .line 57
    and-long/2addr v5, v7

    .line 58
    cmp-long v1, v5, v3

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    const-string v2, "X"

    .line 63
    .line 64
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v1, ")"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0
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
.end method

.method abstract getFlags()J
.end method

.method programType()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;->p_type:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Unknown Section"

    return-object v0

    :pswitch_0
    const-string v0, "Program Header"

    return-object v0

    :pswitch_1
    const-string v0, "PT_SHLIB"

    return-object v0

    :pswitch_2
    const-string v0, "Note"

    return-object v0

    :pswitch_3
    const-string v0, "Interpreter Path"

    return-object v0

    :pswitch_4
    const-string v0, "Dynamic Segment"

    return-object v0

    :pswitch_5
    const-string v0, "Loadable Segment"

    return-object v0

    :pswitch_6
    const-string v0, "NULL"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
