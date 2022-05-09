package com.example.navdrawer_086.ui.slideshow;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navdrawer_086.R;
import com.example.navdrawer_086.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;
    private Button btnTop1, btnTop2, btnTop3, btnMid4, btnMid5, btnMid6, btnMid7, btnBot8, btnBot9, btnBot10, btnSimpan, btnBatal;
    private EditText textNama, textAlamat, textEmail;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        textNama = (EditText) root.findViewById(R.id.insertNama);
        textAlamat = (EditText) root.findViewById(R.id.insertAlamat);
        textEmail = (EditText) root.findViewById(R.id.insertEmail);

        btnTop1 = (Button) root.findViewById(R.id.btnTop1);
        btnTop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fungsiToastAtas(view);
            }
        });

        btnTop2 = (Button) root.findViewById(R.id.btnTop2);
        btnTop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fungsiToastAtas(view);
            }
        });

        btnTop3 = (Button) root.findViewById(R.id.btnTop3);
        btnTop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fungsiToastAtas(view);
            }
        });

        btnMid4 = (Button) root.findViewById(R.id.btnMid4);
        btnMid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fungsiToastTengah(view);
            }
        });

        btnMid5 = (Button) root.findViewById(R.id.btnMid5);
        btnMid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fungsiToastTengah(view);
            }
        });

        btnMid6 = (Button) root.findViewById(R.id.btnMid6);
        btnMid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fungsiToastTengah(view);
            }
        });

        btnMid7 = (Button) root.findViewById(R.id.btnMid7);
        btnMid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fungsiToastTengah(view);
            }
        });

        btnBot8 = (Button) root.findViewById(R.id.btnBot8);
        btnBot8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fungsiToastBawah(view);
            }
        });

        btnBot9 = (Button) root.findViewById(R.id.btnBot9);
        btnBot9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fungsiToastBawah(view);
            }
        });

        btnBot10 = (Button) root.findViewById(R.id.btnBot10);
        btnBot10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fungsiToastBawah(view);
            }
        });

        btnSimpan = (Button) root.findViewById(R.id.btnSimpan);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama, alamat, email;
                nama = textNama.getText().toString().trim();
                alamat = textAlamat.getText().toString().trim();
                email = textEmail.getText().toString().trim();

                AlertDialog.Builder builder= new AlertDialog.Builder(view.getContext());
                builder.setMessage("Nama : " + nama + "\nAlamat : " + alamat + "\nEmail : " + email)
                        .setPositiveButton("OK", new
                                DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int
                                            i) {
                                        Toast.makeText(view.getContext(), "Data anda tidak kami gunakan!", Toast.LENGTH_SHORT).show();
                                    }
                                })
                        .setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                textNama.setText("");
                                textAlamat.setText("");
                                textEmail.setText("");
                                Toast.makeText(view.getContext(), "Data anda kami hapus!", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }
        });

        btnBatal = (Button) root.findViewById(R.id.btnBatal);
        btnBatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder= new AlertDialog.Builder(view.getContext());
                builder.setMessage("Yakin Menghapus Data?")
                        .setPositiveButton("Yakin", new
                                DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int
                                            i) {
                                        textNama.setText("");
                                        textAlamat.setText("");
                                        textEmail.setText("");
                                        Toast.makeText(view.getContext(), "Data anda berhasil dihapus", Toast.LENGTH_SHORT).show();
                                    }
                                })
                        .setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(view.getContext(), "Data anda gajadi dihapus!", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void fungsiToastAtas(View view) {
        Toast.makeText(view.getContext(), "Ini Toas Tombol Atas", Toast.LENGTH_SHORT).show();
    }

    public void fungsiToastTengah(View view) {
        Toast.makeText(view.getContext(), "Ini Toas Tombol Tengah, Durasi Lama!", Toast.LENGTH_LONG).show();
    }

    public void fungsiToastBawah(View view) {
        Toast.makeText(view.getContext(), "Ini Toas Tombol Bawah", Toast.LENGTH_SHORT).show();
    }

}
