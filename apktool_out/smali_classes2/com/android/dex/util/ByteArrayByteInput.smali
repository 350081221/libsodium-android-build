.class public final Lcom/android/dex/util/ByteArrayByteInput;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dex/util/ByteInput;


# instance fields
.field private final bytes:[B

.field private position:I


# direct methods
.method public varargs constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dex/util/ByteArrayByteInput;->bytes:[B

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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


# virtual methods
.method public readByte()B
    .locals 3

    iget-object v0, p0, Lcom/android/dex/util/ByteArrayByteInput;->bytes:[B

    iget v1, p0, Lcom/android/dex/util/ByteArrayByteInput;->position:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/android/dex/util/ByteArrayByteInput;->position:I

    aget-byte v0, v0, v1

    return v0
.end method
