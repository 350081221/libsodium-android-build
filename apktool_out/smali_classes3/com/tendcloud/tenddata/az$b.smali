.class Lcom/tendcloud/tenddata/az$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/az;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field static final DEFAULT_MAX_BSS_ENTRIES:I = 0x32

.field static final DEFAULT_MAX_FINGERPRINTS:I = 0xa

.field static final DEFAULT_MIN_FINGERPRINTS:I = 0x3

.field static final DEFAULT_RSSI_THRESHOLD:I = -0x55


# instance fields
.field private maxBssEntries:I

.field private maxFingerprints:I

.field private minFingerprints:I

.field private rssiThreshold:I


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    iput v0, p0, Lcom/tendcloud/tenddata/az$b;->maxFingerprints:I

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    iput v0, p0, Lcom/tendcloud/tenddata/az$b;->minFingerprints:I

    .line 10
    .line 11
    const/16 v0, 0x32

    .line 12
    .line 13
    iput v0, p0, Lcom/tendcloud/tenddata/az$b;->maxBssEntries:I

    .line 14
    .line 15
    const/16 v0, -0x55

    .line 16
    .line 17
    iput v0, p0, Lcom/tendcloud/tenddata/az$b;->rssiThreshold:I

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method getMaxBssEntries()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/az$b;->maxBssEntries:I

    return v0
.end method

.method getMaxFingerprints()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/az$b;->maxFingerprints:I

    return v0
.end method

.method getMinFingerprints()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/az$b;->minFingerprints:I

    return v0
.end method

.method getRssiThreshold()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/az$b;->rssiThreshold:I

    return v0
.end method

.method setMaxBssEntries(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/az$b;->maxBssEntries:I

    return-void
.end method

.method setMaxFingerprints(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/az$b;->maxFingerprints:I

    return-void
.end method

.method setMinFingerprints(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/az$b;->minFingerprints:I

    return-void
.end method

.method setRssiThreshold(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/az$b;->rssiThreshold:I

    return-void
.end method
