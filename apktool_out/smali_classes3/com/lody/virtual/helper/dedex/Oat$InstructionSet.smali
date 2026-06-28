.class public final Lcom/lody/virtual/helper/dedex/Oat$InstructionSet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Oat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InstructionSet"
.end annotation


# static fields
.field public static final kArm:I = 0x1

.field public static final kArm64:I = 0x2

.field public static final kMips:I = 0x6

.field public static final kMips64:I = 0x7

.field public static final kNone:I = 0x0

.field public static final kThumb2:I = 0x3

.field public static final kX86:I = 0x4

.field public static final kX86_64:I = 0x5


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
