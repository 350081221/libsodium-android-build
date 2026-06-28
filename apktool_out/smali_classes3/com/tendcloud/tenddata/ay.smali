.class public Lcom/tendcloud/tenddata/ay;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I = 0xa

.field public static final b:I = 0x3

.field public static final c:I = 0x32

.field public static final d:I = -0x55


# instance fields
.field private e:I

.field private f:I

.field private g:I

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    iput v0, p0, Lcom/tendcloud/tenddata/ay;->e:I

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    iput v0, p0, Lcom/tendcloud/tenddata/ay;->f:I

    .line 10
    .line 11
    const/16 v0, 0x32

    .line 12
    .line 13
    iput v0, p0, Lcom/tendcloud/tenddata/ay;->g:I

    .line 14
    .line 15
    const/16 v0, -0x55

    .line 16
    .line 17
    iput v0, p0, Lcom/tendcloud/tenddata/ay;->h:I

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/ay;->e:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/ay;->f:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/ay;->g:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/ay;->h:I

    return v0
.end method

.method public setMaxBssEntries(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/ay;->g:I

    return-void
.end method

.method public setMaxFingerprints(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/ay;->e:I

    return-void
.end method

.method public setMinFingerprints(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/ay;->f:I

    return-void
.end method

.method public setRssiThreshold(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/ay;->h:I

    return-void
.end method
