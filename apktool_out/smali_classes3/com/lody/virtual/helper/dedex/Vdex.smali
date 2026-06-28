.class public Lcom/lody/virtual/helper/dedex/Vdex;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/helper/dedex/Vdex$QuickenDex;,
        Lcom/lody/virtual/helper/dedex/Vdex$Header;
    }
.end annotation


# static fields
.field private static final VERSION_OREO_006:I = 0x6

.field private static final VERSION_OREO_MR1_010:I = 0xa

.field private static final VERSION_P_018:I = 0x12


# instance fields
.field public final dexBegin:I

.field public final dexFiles:[Lcom/lody/virtual/helper/dedex/Vdex$QuickenDex;

.field public final header:Lcom/lody/virtual/helper/dedex/Vdex$Header;

.field public final quickeningTableOffsets:[I


# direct methods
.method public constructor <init>(Lcom/lody/virtual/helper/dedex/DataReader;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/helper/dedex/Vdex$Header;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lcom/lody/virtual/helper/dedex/Vdex$Header;-><init>(Lcom/lody/virtual/helper/dedex/DataReader;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Vdex;->header:Lcom/lody/virtual/helper/dedex/Vdex$Header;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->position()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, Lcom/lody/virtual/helper/dedex/Vdex;->dexBegin:I

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lcom/lody/virtual/helper/dedex/DataReader;->position(I)V

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x12

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/dedex/Vdex$Header;->versionNears(I)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget v1, v0, Lcom/lody/virtual/helper/dedex/Vdex$Header;->number_of_dex_files_:I

    .line 29
    .line 30
    new-array v1, v1, [I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    iput-object v1, p0, Lcom/lody/virtual/helper/dedex/Vdex;->quickeningTableOffsets:[I

    .line 35
    .line 36
    iget v0, v0, Lcom/lody/virtual/helper/dedex/Vdex$Header;->number_of_dex_files_:I

    .line 37
    .line 38
    new-array v0, v0, [Lcom/lody/virtual/helper/dedex/Vdex$QuickenDex;

    .line 39
    .line 40
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Vdex;->dexFiles:[Lcom/lody/virtual/helper/dedex/Vdex$QuickenDex;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    :goto_1
    iget-object v1, p0, Lcom/lody/virtual/helper/dedex/Vdex;->header:Lcom/lody/virtual/helper/dedex/Vdex$Header;

    .line 44
    .line 45
    iget v1, v1, Lcom/lody/virtual/helper/dedex/Vdex$Header;->number_of_dex_files_:I

    .line 46
    .line 47
    if-ge v0, v1, :cond_2

    .line 48
    .line 49
    iget-object v1, p0, Lcom/lody/virtual/helper/dedex/Vdex;->quickeningTableOffsets:[I

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    aput v2, v1, v0

    .line 58
    .line 59
    :cond_1
    new-instance v1, Lcom/lody/virtual/helper/dedex/Vdex$QuickenDex;

    .line 60
    .line 61
    invoke-direct {v1, p1}, Lcom/lody/virtual/helper/dedex/Vdex$QuickenDex;-><init>(Lcom/lody/virtual/helper/dedex/DataReader;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Lcom/lody/virtual/helper/dedex/Vdex;->dexFiles:[Lcom/lody/virtual/helper/dedex/Vdex$QuickenDex;

    .line 65
    .line 66
    aput-object v1, v2, v0

    .line 67
    .line 68
    iget v2, v1, Lcom/lody/virtual/helper/dedex/Dex;->dexPosition:I

    .line 69
    .line 70
    iget-object v1, v1, Lcom/lody/virtual/helper/dedex/Dex;->header:Lcom/lody/virtual/helper/dedex/Dex$Header;

    .line 71
    .line 72
    iget v1, v1, Lcom/lody/virtual/helper/dedex/Dex$Header;->file_size_:I

    .line 73
    .line 74
    add-int/2addr v2, v1

    .line 75
    invoke-virtual {p1, v2}, Lcom/lody/virtual/helper/dedex/DataReader;->position(I)V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v0, v0, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    return-void
    .line 82
    .line 83
    .line 84
    .line 85
.end method
